package com.l.spring.dao;

import com.l.spring.di.model.User;

public interface UserDao {
	public User getUser(int id);
	public void save(User user);
	public void update(User user);
	public void delete(int id);
}
