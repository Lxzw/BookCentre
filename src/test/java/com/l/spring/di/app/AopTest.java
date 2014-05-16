package com.l.spring.di.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.spring.di.model.User;

public class AopTest {
	ApplicationContext  ctx =
			new ClassPathXmlApplicationContext("config/AopApplicationContext.xml");
	@Test
	public void test() {
		User user = (User)ctx.getBean("user");
		assertTrue(user.getName().trim().equals("xzw"));
	}

}
