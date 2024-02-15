package br.com.danielcardoso.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danielcardoso.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
