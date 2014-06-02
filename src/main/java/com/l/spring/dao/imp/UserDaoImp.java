package com.l.spring.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;

import com.l.spring.dao.UserDao;
import com.l.spring.model.User;

public class UserDaoImp implements UserDao {
	
	private SessionFactory sessionFactory;

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(user);
	}

	@Override
	public List<?> get() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createQuery("from User u").list();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public User getById(long id) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().load(User.class, id);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
