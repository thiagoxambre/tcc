package br.com.projectmanager.model;

public enum TipoRisco {
	
	PROJETO("Riscos de Projeto de Software"),
	PROCESSO("Riscos de Processo de Software"),
	PRODUTO("Riscos de Produto de Software");
	
	private String nome;
	
	TipoRisco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return this.nome;
	}

}
