package br.com.projectmanager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.projectmanager.model.FornecedorRequisitos;
import br.com.projectmanager.util.AbstractDAO;

@Repository
public class FornecedorRequisitosDAO extends AbstractDAO<FornecedorRequisitos> {
	
    public List<FornecedorRequisitos> getListByProjeto(long idProjeto) {
        List list = getSessionFactory().getCurrentSession().createQuery("from FornecedorRequisitos as fr where fr.projeto = " + idProjeto).list();
        return list;
    }


}
