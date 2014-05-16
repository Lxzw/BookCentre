package com.l.spring.di.app;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.spring.di.model.Book;

public class HibernateTest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"config/applicationContext.xml");

	@Test
	public void test() {
		SessionFactory sessionFactory = (SessionFactory) ctx
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Book book = new Book();
		book.setId(1);
		book.setName("Spring In Action");
		book.setAuthor("Craig Walls");
		book.setPublisher(new Date());
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

}
