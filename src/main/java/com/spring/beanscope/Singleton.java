package com.spring.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Singleton {

	public Prototype getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}

	@Autowired
	private Prototype prototype;
	
	public Singleton() {
		System.out.println("Singleton constructor is called.........");
	}


}
