package com.l.spring.di.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.spring.dao.imp.UserDaoImp;

public class UserDaoImpTest {

	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("config/applicationContext.xml");
	
	@Test
	public void test() {
		UserDaoImp userDaoImp = (UserDaoImp)ctx.getBean("userDaoImp");
		System.out.println(userDaoImp.getUser(1).getName());
	}

}
