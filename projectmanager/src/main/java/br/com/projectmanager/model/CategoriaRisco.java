package br.com.projectmanager.model;

public enum CategoriaRisco {
	TECNICO("Técnico e Desempenho"),
	NEGOCIO("Negócio"),
	GERENCIA("Gerência de Projeto"),
	PROCESSO("Processo");
	
	private String nome;
	
	CategoriaRisco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return this.nome;
	}

	
}
