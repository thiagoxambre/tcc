package br.com.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectmanager.dao.UsuarioDAO;
import br.com.projectmanager.model.Usuario;
import br.com.projectmanager.util.AbstractService;

@Service("UsuarioService")
public class UsuarioService extends AbstractService<Usuario> {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public UsuarioDAO getDao() {
		return usuarioDAO;
	}

}
