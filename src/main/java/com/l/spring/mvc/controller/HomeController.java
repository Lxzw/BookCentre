package com.l.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.l.spring.dao.UserDao;

@Controller
public class HomeController {
	
	private UserDao userDao;
	/**
	 * ͨ��������ע��userDao
	 * @param userDao
	 */
	@Autowired
	public HomeController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@RequestMapping({"/","home"})
	public String showHomePage() {
		return "home";
	}
}
