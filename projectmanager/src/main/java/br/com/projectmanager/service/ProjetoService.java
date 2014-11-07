package br.com.projectmanager.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projectmanager.dao.ProjetoDAO;
import br.com.projectmanager.model.Projeto;

@Service("ProjetoService")
@Transactional(readOnly=true)
public class ProjetoService {
	
	@Autowired
	ProjetoDAO projetoDAO;
	
    @Transactional(readOnly = false)
    public void addProjeto(Projeto projeto) {
        getProjetoDAO().add(projeto);
    }

    @Transactional(readOnly = false)
    public void deleteProjeto(Projeto projeto) {
    	getProjetoDAO().delete(projeto);
    }

    @Transactional(readOnly = false)
    public void updateProjeto(Projeto projeto) {
    	getProjetoDAO().update(projeto);
    }


    public Projeto getProjetoById(int id) {
        return getProjetoDAO().getById(id);
    }


    public List<Projeto> getProjetos() {
        return getProjetoDAO().getList();
    }

    public ProjetoDAO getProjetoDAO() {
        return projetoDAO;
    }

    public void setProjetoDAO(ProjetoDAO projetoDAO) {
        this.projetoDAO = projetoDAO;
    }	

}
