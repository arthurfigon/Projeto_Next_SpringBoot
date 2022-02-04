package com.sysorkole.Springleaf.model.repositories;


import com.sysorkole.Springleaf.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
