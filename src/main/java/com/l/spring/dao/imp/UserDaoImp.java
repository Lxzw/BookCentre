package com.l.spring.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;

import com.l.spring.dao.UserDao;
import com.l.spring.model.User;

public class UserDaoImp implements UserDao {
	
	private SessionFactory sessionFactory;

	public void insert(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().save(user);
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public List<User> get() {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().beginTransaction();
		List<User>	users = sessionFactory
				.getCurrentSession()
				.createQuery("from User u")
				.list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return users;
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().update(user);
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public User getById(long id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().beginTransaction();
		User u = (User)sessionFactory.getCurrentSession().get(User.class,id);
		sessionFactory.getCurrentSession().getTransaction().commit();
		return u;
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().delete(user);
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
