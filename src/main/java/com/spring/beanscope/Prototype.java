package com.spring.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype")
public class Prototype {

	public Prototype() {
		System.out.println("Prototype constructor is called.........");
	}

}
