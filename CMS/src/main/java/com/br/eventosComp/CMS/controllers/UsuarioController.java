package com.br.eventosComp.CMS.controllers;

import com.br.eventosComp.CMS.models.Usuario;
import com.br.eventosComp.CMS.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioRepository repository;

    UsuarioController(UsuarioRepository repository){
        this.repository = repository;
    }

    @PostMapping ("/cadastro")
    Usuario novoUsuario(@RequestBody Usuario novoUsuario) {

        return repository.save(novoUsuario);
    }

    @GetMapping("/usuarios")
    List<Usuario> all() {
        return repository.findAll();
    }





}
