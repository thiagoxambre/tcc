package br.com.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projectmanager.dao.FornecedorRequisitosDAO;
import br.com.projectmanager.model.FornecedorRequisitos;
import br.com.projectmanager.model.Projeto;

@Service("FornecedorRequisitosService")
@Transactional(readOnly=true)
public class FornecedorRequisitosService {
	
	@Autowired
	private FornecedorRequisitosDAO fornecedorRequisitosDAO;


    @Transactional(readOnly = false)
    public void addFornecedorRequisitos(FornecedorRequisitos fornecedorRequisitos) {
        getFornecedorRequisitosDAO().add(fornecedorRequisitos);
    }

    @Transactional(readOnly = false)
    public void deleteFornecedorRequisitos(FornecedorRequisitos fornecedorRequisitos) {
    	getFornecedorRequisitosDAO().delete(fornecedorRequisitos);
    }

    @Transactional(readOnly = false)
    public void updateFornecedorRequisitos(FornecedorRequisitos fornecedorRequisitos) {
    	getFornecedorRequisitosDAO().update(fornecedorRequisitos);
    }


    public FornecedorRequisitos getFornecedorRequisitosById(int id) {
        return getFornecedorRequisitosDAO().getById(id);
    }
    
    public List<FornecedorRequisitos> getFornecedoresRequisitos() {
        return getFornecedorRequisitosDAO().getList();
    }
	
	public FornecedorRequisitosDAO getFornecedorRequisitosDAO() {
		return fornecedorRequisitosDAO;
	}

	public void setFornecedorRequisitosDAO(FornecedorRequisitosDAO fornecedorRequisitosDAO) {
		this.fornecedorRequisitosDAO = fornecedorRequisitosDAO;
	}

	public List<FornecedorRequisitos> getFornecedoresRequisitosByProjeto(Projeto projeto) {
		return getFornecedorRequisitosDAO().getListByProjeto(projeto.getId());
	}
	
	
}
