package net.javafun.career.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDAOHibernate<T>  implements BaseDAO<T>{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(T entiy) {
		sessionFactory.getCurrentSession().save(entiy);
	}


	@Override
	public void delete(T entiy) {
		sessionFactory.getCurrentSession().delete(entiy);		
	}


	@Override
	public void update(T entiy) {
		sessionFactory.getCurrentSession().update(entiy);		
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
