package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="FORNECEDOR_REQUISITOS")
public class FornecedorRequisitos extends AbstractEntity {
	
	@ManyToOne(targetEntity=Projeto.class)
	@JoinColumn(name="PROJETO_ID")
	private Projeto projeto;
	
	private String nome;
	private String email;
	private String telefone;
	private String observacao;

	
	public Projeto getProjeto() {
		return projeto;
	}
	
	@Column(name="NOME")
	public String getNome() {
		return nome;
	}
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	@Column(name="TELEFONE")
	public String getTelefone() {
		return telefone;
	}
	@Column(name="OBSERVACAO")
	public String getObservacao() {
		return observacao;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
