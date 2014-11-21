package br.com.projectmanager.util;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;



@Transactional(readOnly=true)
public abstract class AbstractService <T extends AbstractEntity> {
	
	private AbstractDAO<T> dao;
	
    @Transactional(readOnly = false)
    public void add(T entity) {
        getDao().add(entity);
    }

    @Transactional(readOnly = false)
    public void delete(T entity) {
    	getDao().delete(entity);
    }

    @Transactional(readOnly = false)
    public void update(T entity) {
    	getDao().update(entity);
    }
    
    public T getEntityById(int id) {
        return getDao().getById(id);
    }
    
    public List<T> getList() {
        return getDao().getList();
    }
    

	public abstract AbstractDAO<T> getDao();

	

}
