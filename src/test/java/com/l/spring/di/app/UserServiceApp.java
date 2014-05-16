package com.l.spring.di.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.spring.di.model.User;
import com.l.spring.di.service.LoginService;
import com.l.spring.di.service.SimpleAopService;
import com.l.spring.di.service.UserService;

public class UserServiceApp {

	private ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("config/applicationContext.xml");

	@Test
	public void testGetUserInfo() {
		UserService userService = (UserService)ctx.getBean("userService");
		//System.out.println(userService.getUserInfo());
		assertTrue( userService.getUserInfo() instanceof  String);
	}
	
	@Test
	public void testLogin() {
		User u = (User)ctx.getBean("user");
		u.setName("john");
		u.setPwd("123456");
		LoginService loginService = (LoginService)ctx.getBean("loginService");
		assertTrue(loginService.login() == 1);
	}
	
	@Test
	public void testSimpleAopServiceImp() {
		SimpleAopService sas = (SimpleAopService)ctx.getBean("simpleAopService");
		sas.show();
	}

}
