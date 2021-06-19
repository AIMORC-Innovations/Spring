package com.example.Spring.Singleton;

import java.sql.SQLException;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


//where to search for beans(respective Package---com.example.SpringProject)
@SpringBootApplication
public class SpringProjectApplicationPostgre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//this is bean creation
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringProjectApplicationPostgre.class, args);
		
		PostgressDBOperations bean = applicationContext.getBean(PostgressDBOperations.class);//this is adding dependencies

		String username = "Lakshmi";
		String password = "abc";
		boolean result = bean.validateAccountWithUsernamePassword(username, password);
		System.out.println("result of applicationContext " + result);
	}

}
