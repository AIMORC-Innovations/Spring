package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	car obj =(car) context.getBean("car");// mention class or interface in SmallCase which we Require
    	obj.drive();
	/*
	 * Tyre t =(Tyre)context.getBean("tyre"); System.out.println(t);
	 */
    }
}
