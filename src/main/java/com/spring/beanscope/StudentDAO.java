package com.spring.beanscope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	private StudentDAO studentDao;
	Connection connection;
	
	public String getDriver() {
		return driver;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		 System.out.println("Intialized the resources");
		 DBConnection();
	}
	public void DBConnection() throws SQLException, ClassNotFoundException
	{
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("DB Connection created successfully");
	}
	
	public void logindetails() throws SQLException, ClassNotFoundException
	{
		DBConnection();
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from login");
		while(resultset.next())
		{
			int userid = resultset.getInt(1);
			String username = resultset.getString(2);
			String password = resultset.getString(3);
			String lastlogin = resultset.getString(4);
			
			System.out.println(userid + " " + username + " " + password + " " +lastlogin);
			
		}
		
	}
	
	@PreDestroy
	public void destroy() throws ClassNotFoundException, SQLException {
		System.out.println("resourses closed successfully");
		DBClose();
	}
	
	public void DBClose() throws SQLException, ClassNotFoundException
	{
         connection.close();
        System.out.println("DB Connection closed successfully");
	}
	
	
	

}
