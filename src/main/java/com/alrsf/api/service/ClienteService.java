package com.alrsf.api.service;

import com.alrsf.api.model.Cliente;
import java.util.List;

public interface ClienteService {
    void salvar(Cliente cliente);

    List<Cliente> listar();
}
