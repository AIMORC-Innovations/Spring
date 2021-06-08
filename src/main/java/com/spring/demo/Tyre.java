package com.spring.demo;

import org.springframework.stereotype.Component;
@Component
public class Tyre {

private String brand;


/*
 * public Tyre(String brand) { super(); this.brand = brand; }//Constructor injection
*/
public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

@Override
public String toString() {
	return "It is working... ";
}

}
