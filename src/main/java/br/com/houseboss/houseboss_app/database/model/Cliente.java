package br.com.houseboss.houseboss_app.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String numero;

    @Column(name = "atendimentos_cliente")
            @OneToMany(mappedBy = "cliente")
     private List<Atendimento> atendimentosCliente = new ArrayList<>();

}
