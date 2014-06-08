package com.l.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author L-win8
 *
 *	处理表单传入的数据
 */
@Controller
public class UserController {

	@RequestMapping("/user")
	public String listUserInfo(@RequestParam String username) {
		System.out.println("GET username " + username);
		return "user";
	}
}
