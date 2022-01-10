package com.alrsf.api.repository;

import com.alrsf.api.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    List<Emprestimo> findByClienteId(Long idCliente);
 }
