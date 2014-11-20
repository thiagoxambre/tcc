package br.com.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projectmanager.dao.ResumoUsuariosDAO;
import br.com.projectmanager.model.ResumoUsuarios;
import br.com.projectmanager.model.Projeto;

@Service("ResumoUsuariosService")
@Transactional(readOnly=true)
public class ResumoUsuariosService {
	
	@Autowired
	private ResumoUsuariosDAO resumoUsuariosDAO;
	
    @Transactional(readOnly = false)
    public void addResumoUsuarios(ResumoUsuarios resumoUsuarios) {
        getResumoUsuariosDAO().add(resumoUsuarios);
    }

    @Transactional(readOnly = false)
    public void deleteResumoUsuarios(ResumoUsuarios resumoUsuarios) {
    	getResumoUsuariosDAO().delete(resumoUsuarios);
    }

    @Transactional(readOnly = false)
    public void updateResumoUsuarios(ResumoUsuarios resumoUsuarios) {
    	getResumoUsuariosDAO().update(resumoUsuarios);
    }


    public ResumoUsuarios getResumoUsuariosById(int id) {
        return getResumoUsuariosDAO().getById(id);
    }
    
    public List<ResumoUsuarios> getResumoUsuariosList() {
        return getResumoUsuariosDAO().getList();
    }
	
	public ResumoUsuariosDAO getResumoUsuariosDAO() {
		return resumoUsuariosDAO;
	}

	public void setResumoUsuariosDAO(ResumoUsuariosDAO resumoUsuariosDAO) {
		this.resumoUsuariosDAO = resumoUsuariosDAO;
	}

	public List<ResumoUsuarios> getResumoUsuariosByProjeto(Projeto projeto) {
		return getResumoUsuariosDAO().getListByProjeto(projeto.getId());
	}
	

}
