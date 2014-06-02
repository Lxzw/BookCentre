package com.l.spring.model;

import java.sql.SQLException;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.spring.dao.UserDao;

public class UserTest {
	
	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("config/applicationContext.xml");
	
	/**
	 * 在数据库中创建一张user表
	 * 插入数据并自动生成id
	 * 获得表示所有的数据，并输出
	 * 根据id，获得数据
	 * 根据id，更新数据
	 * 根据id，删除数据
	 * */
	
	@Test
	public void test() throws SQLException {
		User user = ctx.getBean(User.class);
		System.out.println(user.getName());
		UserDao dao =(UserDao)ctx.getBean("userDao");
		dao.insert(user); //同时运行insert和delete,delete中的user会被赋值
		dao.delete(user);
		user.setId(2l);
		user.setName("zhou");
		dao.update(user);
		List<User> users = (List<User>) dao.get();
		for (User u : users) {
			System.out.println(u.getId());
		}
		System.out.println(dao.getById(2).getName());
	}

}
