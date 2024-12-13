package com.projetresergraphql.config;

import com.projetresergraphql.dto.ReservationDTO;
import com.projetresergraphql.dto.UpdateReservationDto;
import com.projetresergraphql.entities.Reservation;
import com.projetresergraphql.service.ReservationService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/reservations")
public class ReservationRestJaxRSAPI {

    @Autowired
    private ReservationService reservationService;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Reservation> getReservations() {
        return reservationService.getAllReservation();
    }

    @Path("/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Reservation getReservation(@PathParam("id") Long id) {
        return reservationService.getReservation(id);
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Reservation createReservation(ReservationDTO reservationDTO) {
        return reservationService.createReservation(reservationDTO);
    }

    @Path("/{id}")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Reservation updateReservation(@PathParam("id") Long id, UpdateReservationDto reservationDto) {
        return reservationService.updateReservation(id, reservationDto);
    }

    @Path("/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteReservation(@PathParam("id") Long id) {
        reservationService.deleteReservation(id);
    }
}