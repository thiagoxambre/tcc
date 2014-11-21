package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.springframework.dao.DataAccessException;

import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.service.ProjetoService;


@ManagedBean(name="projetoMB")
@SessionScoped
public class ProjetoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "lista";
	private static final String SUCESSO = "sucesso";
	private static final String ERRO = "erro";
	private static final String MENUPROJETO = "menuprojeto";
	
	@ManagedProperty(value="#{ProjetoService}")
	ProjetoService projetoService;
	
	private List<Projeto> projetos;
	
	
	private Projeto projeto = new Projeto();
	
	public void cadastrar() {
		getProjetoService().addProjeto(projeto);
		this.projetos = getProjetoService().getProjetos();
		projeto = new Projeto();
	}
	
	public void alterar() {
		getProjetoService().updateProjeto(projeto);
		this.projetos = getProjetoService().getProjetos();
		projeto = new Projeto();
	}
	
	public void deletarProjeto(ActionEvent actionEvent) {
		getProjetoService().deleteProjeto(this.projeto);
		this.projetos = getProjetos();
	}
	
	public String selecionarProjeto () {
		return MENUPROJETO;
	}
	
	public String listaProjetos() {
		return LISTA;
	}
	
	public void reset() {
		this.projeto.setNome("");
		this.projeto.setVisaoGeral("");
	}
	
	public List<Projeto> getProjetos() {
		projetos = new ArrayList<Projeto>();
		projetos.addAll(getProjetoService().getProjetos());
		return projetos;
	}

	public ProjetoService getProjetoService() {
		return projetoService;
	}

	public void setProjetoService(ProjetoService projetoService) {
		this.projetoService = projetoService;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
