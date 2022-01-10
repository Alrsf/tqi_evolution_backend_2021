package com.alrsf.api.service;

import com.alrsf.api.model.Emprestimo;
import java.util.List;

public interface EmprestimoService {
    void salvar(Emprestimo emprestimo);

    List<Emprestimo> listaSimples(Long idCliente);

    List<Emprestimo> listaDetalhe(Long idCliente);
}
