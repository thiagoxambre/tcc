package br.com.projectmanager.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;


@Repository
public abstract class AbstractDAO <T extends AbstractEntity> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }    

    public void add(T entity) {
        getSessionFactory().getCurrentSession().save(entity);
    }
    
    public void delete(T entity) {
        getSessionFactory().getCurrentSession().delete(entity);
    }


    public void update(T entity) {
        getSessionFactory().getCurrentSession().update(entity);
    }


    public T getById(int id) {
        List list = getSessionFactory().getCurrentSession()
                                            .createQuery("from " + getTypeClass().getSimpleName() +" as o where id=?")
                                            .setParameter(0, id).list();
        return (T)list.get(0);
    }


    public List<T> getList() {
        List list = getSessionFactory().getCurrentSession().createQuery("from  " + getTypeClass().getSimpleName() +" as o").list();
        return list;
    }

	private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
	}
    
}
