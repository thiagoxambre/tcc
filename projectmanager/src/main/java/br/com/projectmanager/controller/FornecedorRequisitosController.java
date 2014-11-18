package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.projectmanager.model.FornecedorRequisitos;
import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.service.FornecedorRequisitosService;

@ManagedBean(name="fornecedorRequisitosMB")
@SessionScoped
public class FornecedorRequisitosController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "listafornecedores";
	
	@ManagedProperty(value="#{FornecedorRequisitosService}")
	FornecedorRequisitosService fornecedorRequisitosService;
	
	private FornecedorRequisitos fornecedorRequisitos = new FornecedorRequisitos();

	private Projeto projeto = new Projeto();
	
	
	private List<FornecedorRequisitos> fornecedoresRequisitos;
	
	public void cadastrar() {
		getFornecedorRequisitos().setProjeto(projeto);
		getFornecedorRequisitosService().addFornecedorRequisitos(fornecedorRequisitos);
	}
	
	public String listarFornecedoresRequisitos() {
		return LISTA;
	}

	public FornecedorRequisitosService getFornecedorRequisitosService() {
		return fornecedorRequisitosService;
	}

	public FornecedorRequisitos getFornecedorRequisitos() {
		return fornecedorRequisitos;
	}

	public List<FornecedorRequisitos> getFornecedoresRequisitos() {
		fornecedoresRequisitos = new ArrayList<FornecedorRequisitos>();
		fornecedoresRequisitos.addAll(getFornecedorRequisitosService().getFornecedoresRequisitosByProjeto(getProjeto()));
		return fornecedoresRequisitos;
	}

	public void setFornecedorRequisitosService(
			FornecedorRequisitosService fornecedorRequisitosService) {
		this.fornecedorRequisitosService = fornecedorRequisitosService;
	}

	public void setFornecedorRequisitos(FornecedorRequisitos fornecedorRequisitos) {
		this.fornecedorRequisitos = fornecedorRequisitos;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	

}
