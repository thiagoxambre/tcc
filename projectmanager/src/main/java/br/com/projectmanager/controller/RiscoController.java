package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.projectmanager.model.CategoriaRisco;
import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.model.Risco;
import br.com.projectmanager.model.TipoRisco;
import br.com.projectmanager.service.RiscoService;

@ManagedBean(name="riscoMB")
@SessionScoped
public class RiscoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "listariscos";
	
	@ManagedProperty(value="#{RiscoService}")
	RiscoService riscoService;
	
	private Risco risco = new Risco();
	
	private Projeto projeto = new Projeto();
	
	private List<Risco> riscoList;
	
	public void cadastrar() {
		getRiscoService().add(risco);
		this.riscoList = getRiscoList();
		risco = new Risco();
	}
	
	public void alterar() {
		getRiscoService().update(risco);
		this.riscoList = getRiscoList();
		risco = new Risco();
	}
	

	public void excluir () {
		getRiscoService().delete(risco);
		this.riscoList = getRiscoList();
	}
	
	public String listarRiscos() {
		return LISTA;
	}

	public RiscoService getRiscoService() {
		return riscoService;
	}

	public Risco getRisco() {
		return risco;
	}

	public List<Risco> getRiscoList() {
		riscoList = new ArrayList<Risco>();
		riscoList.addAll(getRiscoService().getByProjeto(getProjeto()));
		return riscoList;
	}

	public void setRiscoService(RiscoService riscoService) {
		this.riscoService = riscoService;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public TipoRisco[] getTiposRisco() {
		return TipoRisco.values();
	}
	
	public CategoriaRisco[] getCategoriasRisco() {
		return CategoriaRisco.values();
	}

}
