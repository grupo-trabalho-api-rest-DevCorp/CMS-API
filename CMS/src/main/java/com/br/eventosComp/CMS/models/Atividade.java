package com.br.eventosComp.CMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "atividades")
@Getter
@Setter
public class Atividade {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Enum tipo;

    private String descricao;

    private Date data;

    private LocalTime horaInicio;

    private LocalTime horaTérmino;

    @OneToOne
    private Espaco local;

}
