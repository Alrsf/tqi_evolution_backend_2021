package com.alrsf.api.service.impl;

import com.alrsf.api.model.Cliente;
import com.alrsf.api.repository.ClienteRepository;
import com.alrsf.api.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final ClienteRepository clienteRepository;

    public LoginServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository; }

    @Override
    public void login(String email, String senha) {
        Cliente cliente = clienteRepository.findByEmail(email);

        if(cliente == null) { throw new RuntimeException("Cliente não existe"); }

        if(!cliente.getSenha().equals(senha)) { throw new RuntimeException("A senha está incorreta"); }
    }
}
