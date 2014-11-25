package br.com.projectmanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.projectmanager.model.Funcao;
import br.com.projectmanager.model.Usuario;
import br.com.projectmanager.service.FuncaoService;
import br.com.projectmanager.service.UsuarioService;

@ManagedBean(name="usuarioMB")
@SessionScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String LISTA = "listausuarios";
	
	@ManagedProperty(value="#{UsuarioService}")
	UsuarioService usuarioService;
	
	@ManagedProperty(value="#{FuncaoService}")
	FuncaoService funcaoService;
	
	private Usuario usuario = new Usuario();
	
	private List<Usuario> usuarioList;
	
	private List<Funcao> funcaoList;
	
	public void cadastrar() {
		getUsuarioService().add(usuario);
		this.usuarioList = getUsuarioList();
		usuario = new Usuario();
	}
	
	public void alterar() {
		getUsuarioService().update(usuario);
		this.usuarioList = getUsuarioList();
		usuario = new Usuario();
	}
	

	public void excluir () {
		getUsuarioService().delete(usuario);
		this.usuarioList = getUsuarioList();
	}
	
	public String listarUsuarios() {
		return LISTA;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public List<Usuario> getUsuarioList() {
		usuarioList = new ArrayList<Usuario>();
		usuarioList.addAll(getUsuarioService().getList());
		return usuarioList;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public FuncaoService getFuncaoService() {
		return funcaoService;
	}

	public void setFuncaoService(FuncaoService funcaoService) {
		this.funcaoService = funcaoService;
	}

	public List<Funcao> getFuncaoList() {
		funcaoList = new ArrayList<Funcao>();
		funcaoList.addAll(getFuncaoService().getList());
		return funcaoList;
	}

}
