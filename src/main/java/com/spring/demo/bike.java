package com.spring.demo;

import org.springframework.stereotype.Component;


@Component
public class bike implements  Vehicle {

	public void drive() {
		System.out.println("Bike is working");
	}
}