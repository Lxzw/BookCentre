package com.l.spring.di.service.imp;

import com.l.spring.di.model.User;
import com.l.spring.di.service.UserService;

public class UserServiceImp implements UserService {
	
	private User u;
	
	@Override
	public String getUserInfo() {
		// TODO Auto-generated method stub
		return "User Info:\n\tname:" + u.getName() +" "
				+ "\n\tage:" + u.getAge() + " "
		        + "\n\tpwd:" + u.getPwd();
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

}
