package com.l.spring.dao.imp;

import com.l.spring.dao.UserDao;
import com.l.spring.di.model.User;

public class UserDaoImp implements UserDao {

	private int id;
	
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
