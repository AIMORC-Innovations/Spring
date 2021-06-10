package com.spring.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Singleton {

	@Autowired
	private Prototype prototype;
	
	public Singleton() {
		System.out.println("Singleton constructor is called.........");
	}


}
