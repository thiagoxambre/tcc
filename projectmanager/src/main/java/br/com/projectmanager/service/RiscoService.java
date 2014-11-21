package br.com.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectmanager.dao.RiscoDAO;
import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.model.Risco;
import br.com.projectmanager.util.AbstractService;

@Service("RiscoService")
public class RiscoService extends AbstractService<Risco> {
	
	@Autowired
	private RiscoDAO riscoDAO;

	
	public List<Risco> getByProjeto(Projeto projeto) {
		return getDao().getListByProjeto(projeto.getId());
	}
	
	
	@Override
	public RiscoDAO getDao() {
		return riscoDAO;
	}
	
}
