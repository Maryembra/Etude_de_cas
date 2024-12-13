package com.projetresergraphql.repository;

import com.projetresergraphql.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
