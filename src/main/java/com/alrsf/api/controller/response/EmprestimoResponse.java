package com.alrsf.api.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoResponse {

    private Long idCliente;

    private Long idEmprestimo;

    private Long valor;

    private Integer parcelas;

}
