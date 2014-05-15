package com.l.spring.di.service.imp;

import com.l.spring.di.model.User;
import com.l.spring.di.service.LoginService;

public class LoginServiceImp implements LoginService {

	private User u;
	
	public LoginServiceImp(User u) {
		this.u = u;
	} 
	
	@Override
	public int login() {
		// TODO Auto-generated method stub
		if (u.getName().trim().equals("john") 
				&& u.getPwd().trim().equals("123456")) {
			return 1;
		}	
		return 0;
	}

}
