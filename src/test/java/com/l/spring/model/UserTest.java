package com.l.spring.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

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
		dao.insert(user);
		
	}

}
