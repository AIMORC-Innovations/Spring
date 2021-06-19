package com.example.Spring.Singleton;

import java.util.Base64;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component//bean
@Scope
public class loginServlet implements InterfacePostgre {

	
	public String getEncodedString(String password)
	{
		String encrytedpassword = Base64.getEncoder().encodeToString(password.getBytes());
		return encrytedpassword;
	}
	
}