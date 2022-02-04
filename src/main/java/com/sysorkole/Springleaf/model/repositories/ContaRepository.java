package com.sysorkole.Springleaf.model.repositories;


import com.sysorkole.Springleaf.model.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
