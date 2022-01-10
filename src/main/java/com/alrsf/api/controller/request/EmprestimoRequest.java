package com.alrsf.api.controller.request;

import lombok.Data;

@Data
public class EmprestimoRequest {

    private Long idCliente;
    private Long valor;
    private Integer parcelas;
    private String data;

}
