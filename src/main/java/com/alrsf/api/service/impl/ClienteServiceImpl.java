package com.alrsf.api.service.impl;

import com.alrsf.api.model.Cliente;
import com.alrsf.api.repository.ClienteRepository;
import com.alrsf.api.service.ClienteService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Cliente cliente) { repository.save(cliente); }

    @Override
    public List<Cliente> listar() {
        return repository.findAll();
    }

}
