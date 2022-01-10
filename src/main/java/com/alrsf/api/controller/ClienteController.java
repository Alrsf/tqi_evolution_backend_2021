package com.alrsf.api.controller;

import com.alrsf.api.controller.request.ClienteRequest;
import com.alrsf.api.model.Cliente;
import com.alrsf.api.service.ClienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service){
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public void salvar(@RequestBody ClienteRequest request) {
        service.salvar(Cliente.builder()
                .nome(request.getNome())
                .email(request.getEmail())
                .cpf(request.getCpf())
                .rg(request.getRg())
                .logradoro(request.getLogradoro())
                .numero(request.getNumero())
                .complemento(request.getComplemento())
                .bairro(request.getBairro())
                .cidade(request.getCidade())
                .estado(request.getEstado())
                .renda(request.getRenda())
                .senha(request.getSenha()).build()); }

}
