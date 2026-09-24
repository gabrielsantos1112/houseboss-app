package br.com.houseboss.houseboss_app.database.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "atendimentos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "descricao_atendimento", nullable = false)
    private String descricao;
    @Column(name = "data_horario")
    private LocalDateTime dataHorario;
    @Column(name = "tipo_pagamento", nullable = false)
    private TipoPagamento tipoPagamento;
    @Column(name = "status_pagamento", nullable = false)
    private StatusPagamento statusPagamento;
    @Column(nullable = false)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
