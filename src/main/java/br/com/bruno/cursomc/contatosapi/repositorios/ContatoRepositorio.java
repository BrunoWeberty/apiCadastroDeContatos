package br.com.bruno.cursomc.contatosapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bruno.cursomc.contatosapi.entidades.Contato;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {

}
