package com.alrsf.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, scale = 2)
    private Long valor;

    @Column(nullable = false)
    private Integer parcelas;

    @Column(nullable = false)
    private String data;

    @ManyToOne
    private Cliente cliente;

}
