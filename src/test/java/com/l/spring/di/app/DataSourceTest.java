package com.l.spring.di.app;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DataSourceTest {

	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("config/applicationContext.xml");
	
	private static final String CREATE_TABLE_BOOK = 
			"create table book("
			+ "id        int,"
			+ "name      varchar(20),"
			+ "age       int,"
			+ "pwd       varchar(20));";
	@Test
	public void test() throws SQLException {
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		Connection conn = ds.getConnection();
		System.out.println(CREATE_TABLE_BOOK);
		PreparedStatement stmt = conn.prepareStatement(CREATE_TABLE_BOOK);
		stmt.execute();
		if(stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

}
