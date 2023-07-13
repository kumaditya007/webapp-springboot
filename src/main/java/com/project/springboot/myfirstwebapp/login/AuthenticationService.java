package com.project.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("Aditya");
		boolean isValidPassword = password.equalsIgnoreCase("abc");
		
		return isValidUsername && isValidPassword;
	}
}
