package com.spring.IOC;

public class Vodafone implements Sim {

	public void calling() {
		System.out.println("Calling using Vodafone");
		
	}

	public String data() {
		return "dialy 1 GB of data can be used";
		
	}
}
