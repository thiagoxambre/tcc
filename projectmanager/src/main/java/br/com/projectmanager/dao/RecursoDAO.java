package br.com.projectmanager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.projectmanager.model.Recurso;
import br.com.projectmanager.util.AbstractDAO;

@Repository
public class RecursoDAO extends AbstractDAO<Recurso> {
	
    public List<Recurso> getListByProjeto(long idProjeto) {
        List list = getSessionFactory().getCurrentSession().createQuery("from Recurso as r where r.projeto = " + idProjeto).list();
        return list;
    }
	

}
