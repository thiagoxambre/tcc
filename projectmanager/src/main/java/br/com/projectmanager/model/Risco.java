package br.com.projectmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Column(name="NOME")
	private String nome;
	@Column(name="DESCRICAO")
	private String descricao;

	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_RISCO")
private TipoRisco tipoRisco;

	@Enumerated(EnumType.STRING)
	@Column(name="CATEGORIA_RISCO")
	private CategoriaRisco categoriaRisco;
	@Column(name="PLANO_CONTINGENCIA")
	private String planoContingencia;
	@Column(name="PROBABILIDADE")
	private double probabilidade;
	@Column(name="IMPACTO")
	private double impacto;
	
	public Projeto getProjeto() {
		return projeto;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public TipoRisco getTipoRisco() {
		return tipoRisco;
	}

	public CategoriaRisco getCategoriaRisco() {
		return categoriaRisco;
	}

	public String getPlanoContingencia() {
		return planoContingencia;
	}
	
	public double getProbabilidade() {
		return probabilidade;
	}
	
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
