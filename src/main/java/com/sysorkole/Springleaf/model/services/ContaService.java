package com.sysorkole.Springleaf.model.services;


import com.sysorkole.Springleaf.model.entities.Conta;
import com.sysorkole.Springleaf.model.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository repository;

    public List<Conta> findAll() {
        return repository.findAll();
    }

    public Conta findById(Long id) {
        Optional<Conta> optional = repository.findById(id);
        return optional.get();
    }
}
