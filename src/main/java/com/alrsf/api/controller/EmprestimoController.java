package com.alrsf.api.controller;

import com.alrsf.api.controller.request.EmprestimoRequest;
import com.alrsf.api.controller.response.EmprestimoDetalheResponse;
import com.alrsf.api.controller.response.EmprestimoResponse;
import com.alrsf.api.model.Cliente;
import com.alrsf.api.model.Emprestimo;
import com.alrsf.api.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) { this.service = service; }

    @GetMapping("/{idCliente}")
    public List<EmprestimoResponse> listaSimples(@PathVariable("idCliente") Long idCLiente) {
        return service.listaSimples(idCLiente).stream().map(this::listar).collect(Collectors.toList()); }

    @GetMapping("/detalhe/{idCliente}")
    public List<EmprestimoDetalheResponse> listaDetalhe(@PathVariable("idCliente") Long idCliente) {
        return service.listaDetalhe(idCliente).stream().map(this::detalhar).collect(Collectors.toList()); }

    @PostMapping
    public void salvar(@RequestBody EmprestimoRequest request) {
        service.salvar(Emprestimo.builder()
                .valor(request.getValor())
                .parcelas(request.getParcelas())
                .data(request.getData())
                .cliente(Cliente.builder().id(request.getIdCliente()).build()).build()); }

    private EmprestimoResponse listar(Emprestimo emprestimo) {
        return EmprestimoResponse.builder()
                .idCliente(emprestimo.getCliente().getId())
                .idEmprestimo(emprestimo.getId())
                .valor(emprestimo.getValor())
                .parcelas(emprestimo.getParcelas()).build(); }

    private EmprestimoDetalheResponse detalhar(Emprestimo emprestimo) {
        return EmprestimoDetalheResponse.builder()
                .idCliente(emprestimo.getCliente().getId())
                .idEmprestimo(emprestimo.getId())
                .valor(emprestimo.getValor())
                .parcelas(emprestimo.getParcelas())
                .data(emprestimo.getData())
                .email(emprestimo.getCliente().getEmail())
                .renda(emprestimo.getCliente().getRenda()).build(); }

}
