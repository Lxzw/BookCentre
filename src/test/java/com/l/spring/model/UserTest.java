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
	 * �����ݿ��д���һ��user��
	 * �������ݲ��Զ�����id
	 * ��ñ�ʾ���е����ݣ������
	 * ����id���������
	 * ����id����������
	 * ����id��ɾ������
	 * */
	
	@Test
	public void test() throws SQLException {
		User user = ctx.getBean(User.class);
		System.out.println(user.getName());
		UserDao dao =(UserDao)ctx.getBean("userDao");
		dao.insert(user); //ͬʱ����insert��delete,delete�е�user�ᱻ��ֵ
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
