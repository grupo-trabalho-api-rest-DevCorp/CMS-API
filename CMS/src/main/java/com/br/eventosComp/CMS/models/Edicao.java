package com.br.eventosComp.CMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "edições")
@Getter
@Setter
public class Edicao {
    @Id
    @GeneratedValue
    private Long id;

    private Integer numero;

    private Integer ano;

    private Date dataInicial;

    private Date dataFinal;

    private String cidade;
    @OneToOne
    private Evento evento;
    @OneToOne
    private Usuario organizador;
    @OneToMany
    private List<Atividade> atividades;
}
