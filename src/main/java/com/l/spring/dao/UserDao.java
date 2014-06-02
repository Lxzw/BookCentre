package com.l.spring.dao;

import java.util.List;

import com.l.spring.model.User;

public interface UserDao {
	public void insert(User user);
	public List<?> get();
	public void update(User user);
	public Object getById(long id);
	public void delete(User user);
}
