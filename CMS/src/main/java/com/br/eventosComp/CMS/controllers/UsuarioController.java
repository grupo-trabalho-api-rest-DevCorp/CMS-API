package com.br.eventosComp.CMS.controllers;

import com.br.eventosComp.CMS.models.Usuario;
import com.br.eventosComp.CMS.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private final UsuarioRepository repository;

    UsuarioController(UsuarioRepository repository){
        this.repository = repository;
    }

    @PostMapping Mapping("/cadastro"){

    }



}
