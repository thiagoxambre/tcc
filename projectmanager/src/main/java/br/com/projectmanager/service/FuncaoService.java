package br.com.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectmanager.dao.FuncaoDAO;
import br.com.projectmanager.model.Funcao;
import br.com.projectmanager.util.AbstractService;

@Service("FuncaoService")
public class FuncaoService extends AbstractService<Funcao> {
	
	@Autowired
	private FuncaoDAO funcaoDAO;
	
	public FuncaoDAO getDao() {
		return funcaoDAO;
	}

}
