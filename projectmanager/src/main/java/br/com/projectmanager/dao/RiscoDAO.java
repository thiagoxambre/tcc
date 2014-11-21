package br.com.projectmanager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.projectmanager.model.Risco;
import br.com.projectmanager.util.AbstractDAO;

@Repository
public class RiscoDAO extends AbstractDAO<Risco> {

    public List<Risco> getListByProjeto(long idProjeto) {
        List list = getSessionFactory().getCurrentSession().createQuery("from Risco as r where r.projeto = " + idProjeto).list();
        return list;
    }

}
