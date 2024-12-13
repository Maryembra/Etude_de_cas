package com.projetresergraphql.controller;

import com.projetresergraphql.dto.ReservationDTO;
import com.projetresergraphql.dto.UpdateReservationDto;
import com.projetresergraphql.entities.Reservation;
import com.projetresergraphql.service.ReservationService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Mutation pour créer une réservation
    @MutationMapping
    public Reservation createReservation(@Argument ReservationDTO reservationDTO) {
        try {
            return reservationService.createReservation(reservationDTO);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erreur lors de la création de la réservation: " + e.getMessage());
        }
    }

    // Query pour obtenir toutes les réservations
    @QueryMapping
    public List<Reservation> getReservations() {
        return reservationService.getAllReservation();
    }

    // Query pour obtenir une réservation par ID
    @QueryMapping
    public Reservation getReservation(@Argument Long id) {
        return reservationService.getReservation(id);
    }

    // Mutation pour mettre à jour une réservation
    @MutationMapping
    public Reservation updateReservation(@Argument Long id, @Argument UpdateReservationDto updateReservationDto) {
        return reservationService.updateReservation(id, updateReservationDto);
    }

    // Mutation pour supprimer une réservation
    @MutationMapping
    public String deleteReservation(@Argument Long id) {
        try {
            reservationService.deleteReservation(id);
            return "La réservation a été supprimée avec succès.";
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Réservation non trouvée pour l'ID: " + id);
        }
    }
}
