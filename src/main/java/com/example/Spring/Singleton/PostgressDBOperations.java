package com.example.Spring.Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//bean
public class PostgressDBOperations  {
	
	@Autowired//dependency injection
	private InterfacePostgre loginServlet;

	public boolean validateAccountWithUsernamePassword(String username, String password)
			throws ClassNotFoundException, SQLException {
		
		System.out.println("password : " + password);
		String encrytedpassword = loginServlet.getEncodedString(password);
		
		System.out.println("encrytedpassword : " + encrytedpassword);
		System.out.println("Username : " + username);

		return true;
	}

}