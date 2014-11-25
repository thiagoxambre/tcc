package br.com.projectmanager.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="USUARIO")
public class Usuario extends AbstractEntity {
	
	@Column(name="USERNAME",nullable=false,unique=true)
	private String username;
	
	@Column(name="SENHA")
	private String senha;
	
	@Column(name="ATIVO")
	private boolean ativo;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="TELEFONE")
	private String telefone;

	@Column(name="OBSERVACAO")
	private String observacao;
	
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name = "USUARIO_FUNCAO", joinColumns = @JoinColumn(name = "USUARIO_ID",columnDefinition="INT(11)",referencedColumnName="ID"), inverseJoinColumns = @JoinColumn(name = "FUNCAO_ID",columnDefinition="INT(11)",referencedColumnName="ID"))	
	private List<Funcao> funcoes;

	public String getUsername() {
		return username;
	}

	public String getSenha() {
		return senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public List<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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

	public void setFuncoes(List<Funcao> funcoes) {
		this.funcoes = funcoes;
	}

	public void addFuncao(Funcao funcao) {
		funcoes.add(funcao);
	}
	
	public void removeFuncao(Funcao funcao) {
		funcoes.remove(funcao);
	}

}
