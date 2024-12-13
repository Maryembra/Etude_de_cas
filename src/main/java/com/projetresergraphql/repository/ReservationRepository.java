package com.projetresergraphql.repository;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.projetresergraphql.entities.Chambre;
import com.projetresergraphql.entities.Reservation;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

        @Query("SELECT r FROM Reservation r WHERE r.chambre.id = :chambreId AND " +
                "(:dateDebut BETWEEN r.dateDebut AND r.dateFin OR " +
                ":dateFin BETWEEN r.dateDebut AND r.dateFin OR " +
                "(r.dateDebut BETWEEN :dateDebut AND :dateFin))")
        List<Reservation> findConflictingReservations(
                @Param("chambreId") Long chambreId,

                @Param("dateDebut") Date dateDebut,

                @Param("dateFin") Date dateFin
        );

        List<Reservation> findByChambreAndDateDebutBeforeAndDateFinAfter(Chambre chambre, Date dateFin, Date dateDebut);
}


