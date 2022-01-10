package com.alrsf.api.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoDetalheResponse {

    private Long idEmprestimo;

    private Long valor;

    private Integer parcelas;

    private String data;

    private Long idCliente;

    private String email;

    private Long renda;
}
