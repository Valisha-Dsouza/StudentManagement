package org.dac.dao;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BaseHibernateDao {
	Configuration configuration = new Configuration();
	SessionFactory sessionFactory = configuration.configure("/hibernate.cfg.xml").buildSessionFactory();
	
	public <T> void insert(T obj){
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(obj);
		transaction.commit();
		session.close();
	}
	
	public <S> S findById(String id, Class clazz){
		Session session = getSession();
		S obj =(S) session.load(clazz,id);
		return obj;
	}
	
	public <T> List<T> getList(Class clazz) {
        Session session = getSession();
        session.createCriteria(clazz).list();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		transaction.commit();
        return session.createCriteria(clazz).list();
    }
	

	public Session getSession(){
		return this.sessionFactory.openSession();
	}
	
	public <T> void delete(T id){
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(id);
		transaction.commit();
		session.close();
	}
	
}
