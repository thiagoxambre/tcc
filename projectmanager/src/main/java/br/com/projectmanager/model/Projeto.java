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
	
	private String setoresEnvolvidos;
	
	private String nomeResponsavel;
	private String emailResponsavel;
	private String telefoneResponsavel;
	private String observacaoResponsavel;
	
	private String problema;
	private String afeta;
	private String impacto;
	private String solucao;
	
	private boolean manualUsuario;
	private boolean ajudaOnline;
	private boolean guiaInstalacao;
	private boolean outroDocumentacao;
	private String textoOutro;
	
	/*
	getters
	*/
	
	@Column(name="NOME",nullable=false)
	public String getNome() {
		return nome;
	}
	
	@Column(name="VISAOGERAL")
	public String getVisaoGeral() {
		return visaoGeral;
	}
	
	@Column(name="SETORESENVOLVIDOS")
	public String getSetoresEnvolvidos() {
		return setoresEnvolvidos;
	}

	@Column(name="NOMERESPONSAVEL")
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	@Column(name="EMAILRESPONSAVEL")
	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	@Column(name="TELEFONERESPONSAVEL")
	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	@Column(name="OBSERVACAORESPONSAVEL")
	public String getObservacaoResponsavel() {
		return observacaoResponsavel;
	}

	@Column(name="PROBLEMA")
	public String getProblema() {
		return problema;
	}

	@Column(name="AFETA")
	public String getAfeta() {
		return afeta;
	}

	@Column(name="IMPACTO")
	public String getImpacto() {
		return impacto;
	}

	@Column(name="SOLUCAO")
	public String getSolucao() {
		return solucao;
	}

	@Column(name="MANUALUSUARIO")
	public boolean isManualUsuario() {
		return manualUsuario;
	}

	@Column(name="AJUDAONLINE")
	public boolean isAjudaOnline() {
		return ajudaOnline;
	}

	@Column(name="GUIAINSTALACAO")
	public boolean isGuiaInstalacao() {
		return guiaInstalacao;
	}

	@Column(name="OUTRODOCUMENTACAO")
	public boolean isOutroDocumentacao() {
		return outroDocumentacao;
	}

	@Column(name="TEXTOOUTRO")
	public String getTextoOutro() {
		return textoOutro;
	}

	/*
	setters
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setVisaoGeral(String visaoGeral) {
		this.visaoGeral = visaoGeral;
	}

	public void setSetoresEnvolvidos(String setoresEnvolvidos) {
		this.setoresEnvolvidos = setoresEnvolvidos;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public void setObservacaoResponsavel(String observacaoResponsavel) {
		this.observacaoResponsavel = observacaoResponsavel;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public void setAfeta(String afeta) {
		this.afeta = afeta;
	}

	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public void setManualUsuario(boolean manualUsuario) {
		this.manualUsuario = manualUsuario;
	}

	public void setAjudaOnline(boolean ajudaOnline) {
		this.ajudaOnline = ajudaOnline;
	}

	public void setGuiaInstalacao(boolean guiaInstalacao) {
		this.guiaInstalacao = guiaInstalacao;
	}

	public void setOutroDocumentacao(boolean outroDocumentacao) {
		this.outroDocumentacao = outroDocumentacao;
	}

	public void setTextoOutro(String textoOutro) {
		this.textoOutro = textoOutro;
	}
	
	

}
