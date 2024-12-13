package com.projetresergraphql.repository;

import com.projetresergraphql.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
