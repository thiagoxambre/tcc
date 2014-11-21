package br.com.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectmanager.dao.RecursoDAO;
import br.com.projectmanager.model.Projeto;
import br.com.projectmanager.model.Recurso;
import br.com.projectmanager.util.AbstractService;


@Service("RecursoService")
public class RecursoService extends AbstractService<Recurso> {
	
	@Autowired
	private RecursoDAO recursoDAO;
	
	public List<Recurso> getByProjeto(Projeto projeto) {
		return getDao().getListByProjeto(projeto.getId());
	}
	
	@Override
	public RecursoDAO getDao() {
		return recursoDAO;
	}

}
