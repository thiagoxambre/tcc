package br.com.projectmanager.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.dao.DataAccessException;

import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.service.ProjetoService;


@ManagedBean(name="projetoMB")
public class ProjetoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String SUCESSO = "sucesso";
	private static final String ERRO = "erro";
	
	@ManagedProperty(value="#{ProjetoService}")
	ProjetoService projetoService;
	
	List<Projeto> projetos;
	
	private int id;
	private String nome;
	private String visaoGeral;
	
	public String addProjeto() {
		try {
			Projeto projeto = new Projeto();
			projeto.setNome(getNome());
			projeto.setVisaoGeral(getVisaoGeral());
			getProjetoService().addProjeto(projeto);
			return SUCESSO;
		} catch (DataAccessException e) {
			e.printStackTrace();			
		}
		return ERRO;
	}
	
	public void reset() {
		this.setNome("");
		this.setVisaoGeral("");
	}
	
	public List<Projeto> getProjetos() {
		projetos = new ArrayList<Projeto>();
		projetos.addAll(getProjetoService().getProjetos());
		return projetos;
	}

	public int getId() {
		return id;
	}

	
	
	public ProjetoService getProjetoService() {
		return projetoService;
	}

	public void setProjetoService(ProjetoService projetoService) {
		this.projetoService = projetoService;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVisaoGeral() {
		return visaoGeral;
	}

	public void setVisaoGeral(String visaoGeral) {
		this.visaoGeral = visaoGeral;
	}

	
}
