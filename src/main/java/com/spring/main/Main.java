package com.spring.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.DI.Student;
import com.spring.DI.StudentAutowire;
import com.spring.DI.StudentConstructor;
import com.spring.IOC.HelloBean;
import com.spring.beanscope.Prototype;
import com.spring.beanscope.Singleton;
import com.spring.beanscope.StudentDAO;
import com.spring.loosecoupling.Mobile;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Configuration loaded");

		((AbstractApplicationContext) context).registerShutdownHook();
		HelloBean hellobean = (HelloBean) context.getBean("hellobean");
		hellobean.sayhello();

		Student keerthana = context.getBean("student1", Student.class);
		keerthana.displayStudentinfo();

		Student dimple = context.getBean("student2", Student.class);
		dimple.displayStudentinfo();

		StudentConstructor keerthanadetails = context.getBean("student3", StudentConstructor.class);
		keerthanadetails.displayStudentdisplay();

		StudentConstructor onlyid = context.getBean("student4", StudentConstructor.class);
		onlyid.displayStudentdisplay();

		Student examid = context.getBean("student5", Student.class);
		examid.examId();

		Student resultid = context.getBean("student6", Student.class);
		resultid.resultTime();

		StudentConstructor results = context.getBean("student7", StudentConstructor.class);
		results.resultTime();

		Student resultbyname = context.getBean("student8", Student.class);
		resultbyname.resultTime();

		StudentConstructor resbyname = context.getBean("student9", StudentConstructor.class);
		resbyname.resultTime();

		StudentConstructor examconstructor = context.getBean("student10", StudentConstructor.class);
		examconstructor.examId();

		StudentAutowire atautowireconstructor = context.getBean("student11", StudentAutowire.class);
		atautowireconstructor.examId();

		StudentAutowire atautowiresetter = context.getBean("student12", StudentAutowire.class);
		atautowiresetter.examId();

		StudentAutowire examdetails = context.getBean("student13", StudentAutowire.class);
		examdetails.examId();

		StudentDAO studentdao = context.getBean("studentDao", StudentDAO.class);
		studentdao.logindetails();

		Singleton singleton1 = context.getBean("singleton", Singleton.class);
		Singleton singleton2 = context.getBean("singleton", Singleton.class);
		System.out.println("Singleton bean scope" + singleton1 + " " + singleton2);
		if (singleton1 == singleton2) {
			System.out.println("Both the objects are same........");
		}

		Prototype prototype1 = context.getBean("prototype", Prototype.class);
		Prototype prototype2 = context.getBean("prototype", Prototype.class);
		System.out.println("Prototype bean scope" + prototype1 + " " + prototype2);
		if (prototype1 == prototype2) {
			System.out.println("Both the objects are same........");
		} else {
			System.out.println("Both the objects are different........");
		}
        
		Singleton singleton3 = context.getBean("singleton", Singleton.class);
		System.out.println(singleton3.getPrototype());
		System.out.println(singleton3.getPrototype());
		
		Mobile mob = context.getBean("mobile", Mobile.class);
		mob.calling();
		mob.data();
		
		
		
		((AbstractApplicationContext) context).close();

	}

}