package br.com.bruno.cursomc.contatosapi.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data

public class Contato {
	
	@Id
	private Long id;
	private String nome;
	private String telefone;
}
