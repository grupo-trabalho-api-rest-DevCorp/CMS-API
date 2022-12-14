package com.br.eventosComp.CMS.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue
    private Long id ;
    private String login;
    private String email;
    private String nome;
    private String afiliacao;


    @OneToMany
    private List<Atividade> favoritos;
}
