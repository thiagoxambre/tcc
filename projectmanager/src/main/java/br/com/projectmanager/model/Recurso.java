package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="RECURSO")
public class Recurso extends AbstractEntity {
	
	@ManyToOne(targetEntity=Projeto.class)
	@JoinColumn(name="PROJETO_ID")
	private Projeto projeto;
	
	private String nome;
	private String descricao;
	
	public Projeto getProjeto() {
		return projeto;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	@Column(name="DESCRICAO")
	public String getDescricao() {
		return descricao;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
