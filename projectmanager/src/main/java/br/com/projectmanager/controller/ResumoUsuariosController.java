package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.projectmanager.model.ResumoUsuarios;
import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.service.ResumoUsuariosService;


@ManagedBean(name="resumoUsuariosMB")
@SessionScoped
public class ResumoUsuariosController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "listausuarios";
	
	@ManagedProperty(value="#{ResumoUsuariosService}")
	ResumoUsuariosService resumoUsuariosService;
	
	private ResumoUsuarios resumoUsuarios = new ResumoUsuarios();
	
	private Projeto projeto = new Projeto();

	
	private List<ResumoUsuarios> resumoUsuariosList;
	
	public void cadastrar() {
		getResumoUsuariosService().addResumoUsuarios(resumoUsuarios);
		this.resumoUsuariosList = getResumoUsuariosList();
		resumoUsuarios = new ResumoUsuarios();
	}
	
	public void alterar() {
		getResumoUsuariosService().updateResumoUsuarios(resumoUsuarios);
		this.resumoUsuariosList = getResumoUsuariosList();
		resumoUsuarios = new ResumoUsuarios();
	}
	

	public void excluir () {
		getResumoUsuariosService().deleteResumoUsuarios(resumoUsuarios);
		this.resumoUsuariosList = getResumoUsuariosList();
	}
	
	public String listarResumoUsuarios() {
		return LISTA;
	}

	public ResumoUsuariosService getResumoUsuariosService() {
		return resumoUsuariosService;
	}

	public ResumoUsuarios getResumoUsuarios() {
		return resumoUsuarios;
	}

	public List<ResumoUsuarios> getResumoUsuariosList() {
		resumoUsuariosList = new ArrayList<ResumoUsuarios>();
		resumoUsuariosList.addAll(getResumoUsuariosService().getResumoUsuariosByProjeto(getProjeto()));
		return resumoUsuariosList;
	}

	public void setResumoUsuariosService(ResumoUsuariosService resumoUsuariosService) {
		this.resumoUsuariosService = resumoUsuariosService;
	}

	public void setResumoUsuarios(ResumoUsuarios resumoUsuarios) {
		this.resumoUsuarios = resumoUsuarios;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	

}
