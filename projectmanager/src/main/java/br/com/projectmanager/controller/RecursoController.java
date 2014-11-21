package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.model.Recurso;
import br.com.projectmanager.service.RecursoService;


@ManagedBean(name="recursoMB")
@SessionScoped
public class RecursoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "listarecursos";
	
	@ManagedProperty(value="#{RecursoService}")
	RecursoService recursoService;
	
	private Recurso recurso = new Recurso();
	
	private Projeto projeto = new Projeto();

	
	private List<Recurso> recursoList;
	
	public void cadastrar() {
		getRecursoService().add(recurso);
		this.recursoList = getRecursoList();
		recurso = new Recurso();
	}
	
	public void alterar() {
		getRecursoService().update(recurso);
		this.recursoList = getRecursoList();
		recurso = new Recurso();
	}
	

	public void excluir () {
		getRecursoService().delete(recurso);
		this.recursoList = getRecursoList();
	}
	
	public String listarRecursos() {
		return LISTA;
	}

	public RecursoService getRecursoService() {
		return recursoService;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public List<Recurso> getRecursoList() {
		recursoList = new ArrayList<Recurso>();
		recursoList.addAll(getRecursoService().getByProjeto(getProjeto()));
		return recursoList;
	}

	public void setRecursoService(RecursoService recursoService) {
		this.recursoService = recursoService;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	

	
	
}
