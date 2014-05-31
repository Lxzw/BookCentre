package com.l.spring.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("config/applicationContext.xml");

	@Test
	public void test() throws SQLException {
		User user = ctx.getBean(User.class);
		System.out.println(user.getName());
		DataSource ds =(DataSource)ctx.getBean("dataSource");
		System.out.println(ds.getConnection().getCatalog());
	}

}
