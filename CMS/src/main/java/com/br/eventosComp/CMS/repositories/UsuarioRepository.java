package com.br.eventosComp.CMS.repositories;

import com.br.eventosComp.CMS.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
