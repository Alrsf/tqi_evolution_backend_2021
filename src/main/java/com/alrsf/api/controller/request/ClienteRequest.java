package com.alrsf.api.controller.request;

import lombok.Data;

@Data
public class ClienteRequest {

    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String logradoro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private Long renda;
    private String senha;

}
