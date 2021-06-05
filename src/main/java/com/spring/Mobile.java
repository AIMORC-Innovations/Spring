package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args)
	{
		
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");	
	System.out.println("Configuration loaded");	
	
	
	/*
	 * Airtel air = (Airtel)context.getBean("airtel"); air.data(); air.calling();
	 */
	
	Sim sim = context.getBean("sim", Sim.class);
	sim.data();
	sim.calling();
	
		

	}

}
