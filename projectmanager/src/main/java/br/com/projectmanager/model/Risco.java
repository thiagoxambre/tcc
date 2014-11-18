package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projectmanager.util.AbstractEntity;

@Entity
@Table(name="RISCO")
public class Risco extends AbstractEntity {
	
	@ManyToOne(targetEntity=Projeto.class)
	@JoinColumn(name="PROJETO_ID")
	private Projeto projeto;
	
	private String nome;
	private String descricao;
	private TipoRisco tipoRisco;
	private CategoriaRisco categoriaRisco;
	private String planoContingencia;
	private double probabilidade;
	private double impacto;
	
	public Projeto getProjeto() {
		return projeto;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	@Column(name="NOME")
	public String getDescricao() {
		return descricao;
	}

	@Column(name="TIPO_RISCO")
	public TipoRisco getTipoRisco() {
		return tipoRisco;
	}

	@Column(name="CATEGORIA_RISCO")
	public CategoriaRisco getCategoriaRisco() {
		return categoriaRisco;
	}

	@Column(name="PLANO_CONTIGENCIA")
	public String getPlanoContingencia() {
		return planoContingencia;
	}
	
	@Column(name="PROBABILIDADE")
	public double getProbabilidade() {
		return probabilidade;
	}
	
	@Column(name="IMPACTO")
	public double getImpacto() {
		return impacto;
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
	public void setTipoRisco(TipoRisco tipoRisco) {
		this.tipoRisco = tipoRisco;
	}
	public void setCategoriaRisco(CategoriaRisco categoriaRisco) {
		this.categoriaRisco = categoriaRisco;
	}
	public void setPlanoContingencia(String planoContingencia) {
		this.planoContingencia = planoContingencia;
	}
	public void setProbabilidade(double probabilidade) {
		this.probabilidade = probabilidade;
	}
	public void setImpacto(double impacto) {
		this.impacto = impacto;
	}

}
