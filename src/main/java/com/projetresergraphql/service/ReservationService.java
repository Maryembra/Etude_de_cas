package com.projetresergraphql.service;


import com.projetresergraphql.dto.ReservationDTO;
import com.projetresergraphql.dto.UpdateReservationDto;
import com.projetresergraphql.entities.Chambre;
import com.projetresergraphql.entities.Client;
import com.projetresergraphql.entities.Reservation;
import com.projetresergraphql.repository.ChambreRepository;
import com.projetresergraphql.repository.ClientRepository;
import com.projetresergraphql.repository.ReservationRepository;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;
public List<Reservation> getAllReservation(){
    return reservationRepository.findAll();
}


    public Reservation createReservation(ReservationDTO reservationDTO) {
        if (reservationDTO.getDateDebut() == null || reservationDTO.getDateFin() == null) {
            throw new IllegalArgumentException("Les dates de début et de fin doivent être fournies.");
        }

        Date dateDebut = reservationDTO.getDateDebut();
        Date dateFin = reservationDTO.getDateFin();

        // Validation des dates
        if (!dateDebut.before(dateFin)) {
            throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin.");
        }

        // Vérifier que le client existe
        Client client = clientRepository.findById(reservationDTO.getIdClient())
                .orElseThrow(() -> new IllegalArgumentException("Client non trouvé"));

        // Vérifier que la chambre existe
        Chambre chambre = chambreRepository.findById(reservationDTO.getIdChambre())
                .orElseThrow(() -> new IllegalArgumentException("Chambre non trouvée"));

        // Vérifier les conflits de réservation
        List<Reservation> conflictingReservations = reservationRepository.findConflictingReservations(
                reservationDTO.getIdChambre(),
                dateDebut,
                dateFin
        );
        if (!conflictingReservations.isEmpty()) {
            throw new IllegalArgumentException("La chambre est déjà réservée pour cette période.");
        }

        // Créer et sauvegarder la réservation
        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setPreferences(reservationDTO.getPreferences());

        return reservationRepository.save(reservation);
    }

    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Réservation introuvable."));
    }
    public Reservation updateReservation(Long id, UpdateReservationDto updateReservationDto) {
        // Récupérer la réservation existante
        Reservation existingReservation = getReservation(id);

        Date newDateDebut = updateReservationDto.getDateDebut();
        Date newDateFin = updateReservationDto.getDateFin();

        if (newDateDebut == null || newDateFin == null) {
            throw new IllegalArgumentException("Les dates de début et de fin doivent être fournies.");
        }

        // Valider les dates
        if (!newDateDebut.before(newDateFin)) {
            throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin.");
        }

        // Vérifier les conflits, en excluant la réservation actuelle
        List<Reservation> conflictingReservations = reservationRepository.findConflictingReservations(
                existingReservation.getChambre().getId(),
                newDateDebut,
                newDateFin
        );
        if (conflictingReservations.stream().anyMatch(r -> !r.getId().equals(id))) {
            throw new IllegalArgumentException("La chambre n'est pas disponible pour les dates sélectionnées.");
        }

        // Mise à jour des informations
        existingReservation.setDateDebut(newDateDebut);
        existingReservation.setDateFin(newDateFin);
        return reservationRepository.save(existingReservation);
    }


    // Méthode pour vérifier la disponibilité de la chambre
    private boolean isChambreAvailable(Chambre chambre, Date dateDebut, Date dateFin) {
        // Vérifier si d'autres réservations existent pour cette chambre pendant la période demandée
        List<Reservation> existingReservations = reservationRepository.findByChambreAndDateDebutBeforeAndDateFinAfter(
                chambre, dateFin, dateDebut);
        return existingReservations.isEmpty();
    }

    public void deleteReservation(Long id) {
        Reservation reservation = getReservation(id); // Récupérer la réservation par ID

        if (reservation != null) {
            reservationRepository.deleteById(id); // Supprimer la réservation si elle existe
        } else {
            throw new EntityNotFoundException("La réservation avec l'ID " + id + " n'existe pas."); // Exception si réservation non trouvée
        }
    }

}
