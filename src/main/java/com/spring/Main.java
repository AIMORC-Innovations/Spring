package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args)
	{
		
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");	
	System.out.println("Configuration loaded");	
	
	HelloBean hellobean = (HelloBean)context.getBean("hellobean"); 
			hellobean.sayhello();
			
			Student keerthana = context.getBean("student1",Student.class);
			keerthana.displayStudentinfo();
			
			Student dimple = context.getBean("student2",Student.class);
			dimple.displayStudentinfo();
			
			StudentConstructor keerthanadetails = context.getBean("student3",StudentConstructor.class);
			keerthanadetails.displayStudentdisplay();
			
	
	}

}