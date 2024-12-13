package com.projetresergraphql.controller;

import com.projetresergraphql.dto.ReservationDTO;
import com.projetresergraphql.dto.UpdateReservationDto;
import com.projetresergraphql.entities.Reservation;
import com.projetresergraphql.service.ReservationService;
import com.projetresergraphql.stubs.*;
import io.grpc.stub.StreamObserver;

import net.devh.boot.grpc.server.service.GrpcService;

import java.sql.Date;
import java.util.stream.Collectors;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    private final ReservationService reservationService;

    public ReservationServiceImpl(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @Override
    public void allReservations(GetAllReservationsRequest request,
                                StreamObserver<GetAllReservationsResponse> responseObserver) {
        var reservations = reservationService.getAllReservation().stream()
                .map(reservation -> ReservationGrpc.newBuilder()
                        .setId(reservation.getId().toString())
                        .setClientId(reservation.getClient().getId().toString())
                        .setChambreId(reservation.getChambre().getId().toString())
                        .setDateDebut(reservation.getDateDebut().toString())
                        .setDateFin(reservation.getDateFin().toString())
                        .setPreferences(reservation.getPreferences())
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(GetAllReservationsResponse.newBuilder()
                .addAllReservations(reservations).build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveReservation(SaveReservationRequest request,
                                StreamObserver<SaveReservationResponse> responseObserver) {
        try {
            var reservationReq = request.getReservation();

            ReservationDTO dto = new ReservationDTO();
            dto.setIdClient(Long.parseLong(reservationReq.getClientId()));
            dto.setIdChambre(Long.parseLong(reservationReq.getChambreId()));
            dto.setDateDebut(Date.valueOf(reservationReq.getDateDebut()));
            dto.setDateFin(Date.valueOf(reservationReq.getDateFin()));
            dto.setPreferences(reservationReq.getPreferences());

            Reservation savedReservation = reservationService.createReservation(dto);

            var grpcReservation = ReservationGrpc.newBuilder()
                    .setId(savedReservation.getId().toString())
                    .setClientId(savedReservation.getClient().getId().toString())
                    .setChambreId(savedReservation.getChambre().getId().toString())
                    .setDateDebut(savedReservation.getDateDebut().toString())
                    .setDateFin(savedReservation.getDateFin().toString())
                    .setPreferences(savedReservation.getPreferences())
                    .build();

            responseObserver.onNext(SaveReservationResponse.newBuilder()
                    .setReservation(grpcReservation).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("Erreur : " + e.getMessage()));
        }
    }
    @Override
    public void updateReservation(UpdateReservationRequest request,
                                  StreamObserver<UpdateReservationResponse> responseObserver) {
        try {
            // Récupération des informations de la requête
            Long reservationId = Long.parseLong(request.getId());
            var reservationUpdate = request.getReservation();

            UpdateReservationDto updateDto = new UpdateReservationDto();
            updateDto.setDateDebut(Date.valueOf(reservationUpdate.getDateDebut()));
            updateDto.setDateFin(Date.valueOf(reservationUpdate.getDateFin()));

            // Appel au service pour mettre à jour la réservation
            Reservation updatedReservation = reservationService.updateReservation(reservationId, updateDto);

            // Conversion de l'entité mise à jour en gRPC
            var grpcReservation = ReservationGrpc.newBuilder()
                    .setId(updatedReservation.getId().toString())
                    .setClientId(updatedReservation.getClient().getId().toString())
                    .setChambreId(updatedReservation.getChambre().getId().toString())
                    .setDateDebut(updatedReservation.getDateDebut().toString())
                    .setDateFin(updatedReservation.getDateFin().toString())
                    .setPreferences(updatedReservation.getPreferences())
                    .build();

            // Envoi de la réponse
            responseObserver.onNext(UpdateReservationResponse.newBuilder()
                    .setReservation(grpcReservation).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("Erreur : " + e.getMessage()));
        }
    }
    @Override
    public void reservationById(GetReservationByIdRequest request,
                                StreamObserver<GetReservationByIdResponse> responseObserver) {
        try {
            // Vérification si l'ID est valide
            Long reservationId;
            try {
                reservationId = Long.parseLong(request.getId());
            } catch (NumberFormatException e) {
                responseObserver.onError(new Throwable("ID invalide : " + request.getId()));
                return;
            }

            // Appel au service pour récupérer la réservation
            Reservation reservation = reservationService.getReservation(reservationId);

            // Conversion de l'entité en format gRPC
            var grpcReservation = ReservationGrpc.newBuilder()
                    .setId(reservation.getId().toString())
                    .setClientId(reservation.getClient().getId().toString())
                    .setChambreId(reservation.getChambre().getId().toString())
                    .setDateDebut(reservation.getDateDebut().toString())
                    .setDateFin(reservation.getDateFin().toString())
                    .setPreferences(reservation.getPreferences())
                    .build();

            // Envoi de la réponse
            responseObserver.onNext(GetReservationByIdResponse.newBuilder()
                    .setReservation(grpcReservation).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Log l'erreur et renvoie le message d'erreur détaillé
            e.printStackTrace();  // Affiche l'erreur dans les logs du serveur
            responseObserver.onError(new Throwable("Erreur lors de la récupération de la réservation : " + e.getMessage()));
        }
    }

    @Override
    public void deleteReservationById(DeleteReservationRequest request,
                                      StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            // Appel au service pour supprimer la réservation
            Long reservationId = Long.parseLong(request.getId());
            reservationService.deleteReservation(reservationId);

            // Envoi de la réponse de succès
            responseObserver.onNext(DeleteReservationResponse.newBuilder()
                    .setMessage("Réservation supprimée avec succès.")
                    .setSuccess(true)
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onNext(DeleteReservationResponse.newBuilder()
                    .setMessage("Erreur : " + e.getMessage())
                    .setSuccess(false)
                    .build());
            responseObserver.onCompleted();
        }
    }


}
