package com.alrsf.api.service.impl;

import com.alrsf.api.model.Emprestimo;
import com.alrsf.api.repository.EmprestimoRepository;
import com.alrsf.api.service.EmprestimoService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    private final EmprestimoRepository repository;

    public EmprestimoServiceImpl(EmprestimoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Emprestimo emprestimo) {

            if (emprestimo.getParcelas() > 60) { throw new RuntimeException("Limite máximo de parcelas é 60"); }

            String[] dataSeparada = emprestimo.getData().split("/");

            LocalDate hoje = LocalDate.now();
            LocalDate dataSolicitada = LocalDate.of(
                Integer.parseInt(dataSeparada[2]),
                Integer.parseInt(dataSeparada[1]),
                Integer.parseInt(dataSeparada[0]));

            Period periodo = Period.between(hoje, dataSolicitada);
            int dias = periodo.getDays();
            int meses = periodo.getMonths();

            if (meses > 3) { throw new RuntimeException("Limite máximo da data é 3 meses"); }

        repository.save(emprestimo);
    }

    @Override
    public List<Emprestimo> listaSimples(Long idCliente) { return repository.findByClienteId(idCliente); }

    @Override
    public List<Emprestimo> listaDetalhe(Long idCliente) {
        return repository.findByClienteId(idCliente);
    }
}
