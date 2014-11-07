package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="PROJETO")
public class Projeto extends AbstractEntity {
	
	private String nome;
	private String visaoGeral;
	
	@Column(name="NOME",nullable=false)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="VISAOGERAL")
	public String getVisaoGeral() {
		return visaoGeral;
	}
	
	public void setVisaoGeral(String visaoGeral) {
		this.visaoGeral = visaoGeral;
	}
	
	

}
