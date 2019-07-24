package com.revature.service;

import java.sql.SQLException;

import com.revature.bean.Credentials;
import com.revature.bean.User;
import com.revature.dao.UserDAOImpl;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	// return a User object if a valid user exists 
	// otherwise return null
	public User authenticateUser(Credentials creds) {
		User u = new User();
		
		u.setSuccess(false);
		
		try {
			if(UserDAOImpl.loginConfirm(creds.getUsername(), creds.getPassword(), creds.getPosition(), u) == true) {
				System.out.println("Login successful!");
				u.setSuccess(true);
				
			}
			else{
				System.out.println("Login not successful.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

}