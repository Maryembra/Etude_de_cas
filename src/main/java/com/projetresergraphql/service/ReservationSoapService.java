package com.projetresergraphql.service;



import com.projetresergraphql.dto.ReservationDTO;
import com.projetresergraphql.entities.Chambre;
import com.projetresergraphql.entities.Client;
import com.projetresergraphql.entities.Reservation;
import com.projetresergraphql.repository.ChambreRepository;
import com.projetresergraphql.repository.ClientRepository;
import com.projetresergraphql.repository.ReservationRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@WebService(serviceName = "ReservationSoapService")
public class ReservationSoapService {


    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public Reservation createReservation(@WebParam(name = "request") ReservationDTO dto) {
        System.out.println("Creating reservation for client ID: " + dto.getIdClient() + ", chambre ID: " + dto.getIdChambre());
        if (dto.getIdClient() == null || dto.getIdChambre() == null) {
            throw new IllegalArgumentException("Client ID and Chambre ID must be provided");
        }


        Client client = clientRepository.findById(dto.getIdClient())
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + dto.getIdClient()));
        Chambre chambre = chambreRepository.findById(dto.getIdChambre())
                .orElseThrow(() -> new RuntimeException("Chambre not found with ID: " + dto.getIdChambre()));


        Reservation reservation = new Reservation();
        reservation.setDateDebut(dto.getDateDebut());
        reservation.setDateFin(dto.getDateFin());
        reservation.setPreferences(dto.getPreferences());
        reservation.setClient(client);
        reservation.setChambre(chambre);


        return reservationRepository.save(reservation);
    }

    @WebMethod
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found with ID: " + id));
    }

    @WebMethod
    public void deleteReservation(@WebParam(name = "id") Long id) {
        try {
            reservationRepository.deleteById(id);
        } catch (Exception e) {
            // Optionally, log the exception or rethrow a WebServiceException
            throw new WebServiceException("Error deleting reservation: " + e.getMessage());
        }
    }
    @WebMethod
    public Reservation updateReservation(@WebParam(name = "id") Long id, @WebParam(name = "request") ReservationDTO dto) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setDateDebut(dto.getDateDebut());
            reservation.setDateFin(dto.getDateFin());
            reservation.setPreferences(dto.getPreferences());

            if (dto.getIdClient() != null) {
                Client client = clientRepository.findById(dto.getIdClient())
                        .orElseThrow(() -> new RuntimeException("Client not found with ID: " + dto.getIdClient()));
                reservation.setClient(client);
            }

            if (dto.getIdChambre() != null) {
                Chambre chambre = chambreRepository.findById(dto.getIdChambre())
                        .orElseThrow(() -> new RuntimeException("Chambre not found with ID: " + dto.getIdChambre()));
                reservation.setChambre(chambre);
            }

            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new RuntimeException("Reservation not found with ID: "+id));
}
}