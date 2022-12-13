package io.github.guimendes.clientes.model.entity;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data

public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal valor;


}
