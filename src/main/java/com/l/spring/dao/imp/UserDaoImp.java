package com.l.spring.dao.imp;

import org.springframework.jdbc.core.JdbcTemplate;

import com.l.spring.dao.UserDao;
import com.l.spring.di.model.User;

public class UserDaoImp implements UserDao {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = jdbcTemplate.queryForObject("select * from User u where u.id=" + id + ";", User.class);
		return user;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
