package com.spring.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Singleton {
	@Autowired
	private Prototype prototype;
	
	@Lookup
	Prototype createobject()
	{
		return null;
	}

	public Prototype getPrototype() {
		Prototype prototype = createobject();
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}


	
	public Singleton() {
		System.out.println("Singleton constructor is called.........");
	}


}
