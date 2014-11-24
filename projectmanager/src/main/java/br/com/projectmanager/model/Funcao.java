package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="FUNCAO")
public class Funcao extends AbstractEntity {
	
	@Column(name="NOME")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
