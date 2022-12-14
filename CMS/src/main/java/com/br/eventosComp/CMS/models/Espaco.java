package com.br.eventosComp.CMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "espaços")
@Getter
@Setter
public class Espaco {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String localizacao;

    private Integer capacidade;

    @ElementCollection
    private List<String> recursos;

}
