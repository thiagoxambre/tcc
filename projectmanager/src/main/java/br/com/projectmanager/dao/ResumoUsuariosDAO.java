package br.com.projectmanager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.projectmanager.model.ResumoUsuarios;
import br.com.projectmanager.util.AbstractDAO;

@Repository
public class ResumoUsuariosDAO extends AbstractDAO<ResumoUsuarios> {

    public List<ResumoUsuarios> getListByProjeto(long idProjeto) {
        List list = getSessionFactory().getCurrentSession().createQuery("from ResumoUsuarios as ru where ru.projeto = " + idProjeto).list();
        return list;
    }
	
}
