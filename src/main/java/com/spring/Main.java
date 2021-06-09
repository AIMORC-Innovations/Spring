package com.spring;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
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
			
			StudentConstructor onlyid = context.getBean("student4",StudentConstructor.class);
			onlyid.displayStudentdisplay();
			
		    Student examid = context.getBean("student5",Student.class);
			examid.examId();
			
			
			 Student resultid = context.getBean("student6",Student.class);
			 resultid.resultTime();
		 
			
			StudentConstructor results = context.getBean("student7",StudentConstructor.class);
			results.resultTime();
	
			Student resultbyname = context.getBean("student8",Student.class);
			resultbyname.resultTime();
			 
			StudentConstructor resbyname = context.getBean("student9",StudentConstructor.class);
			resbyname.resultTime();
			
			StudentConstructor examconstructor = context.getBean("student10",StudentConstructor.class);
			examconstructor.examId();
			 
			
			StudentAutowire atautowireconstructor =context.getBean("student11",StudentAutowire.class);
			 atautowireconstructor.examId();
			 
			
			StudentAutowire atautowiresetter = context.getBean("student12",StudentAutowire.class);
			atautowiresetter.examId();
			
			StudentAutowire examdetails = context.getBean("student13",StudentAutowire.class);
			examdetails.examId();
			
			ApplicationContext context1 = new ClassPathXmlApplicationContext("studentdao.xml");	
			System.out.println("DB Connection loaded");		
			
			StudentDAO studentdao = context1.getBean("studentDao",StudentDAO.class);
			studentdao.logindetails();
			
			
			
			
		
			
			
	}

}