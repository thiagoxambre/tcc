package br.com.projectmanager.model;

public enum CategoriaRisco {
	TECNICO("T�cnico e Desempenho"),
	NEGOCIO("Neg�cio"),
	GERENCIA("Ger�ncia de Projeto"),
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
