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
		dao.insert(user);
		
	}

}
