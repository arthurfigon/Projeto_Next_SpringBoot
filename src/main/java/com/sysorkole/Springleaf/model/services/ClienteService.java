package com.sysorkole.Springleaf.model.services;


import com.sysorkole.Springleaf.model.entities.Cliente;
import com.sysorkole.Springleaf.model.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Long id){
        Optional<Cliente> optional = repository.findById(id);
        return optional.get();
    }

}
