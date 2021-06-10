package com.spring.IOC;

import org.springframework.beans.factory.annotation.Autowired;

public class Airtel implements Sim {
	
	@Autowired
	private Vodafone vodafone;
	public void calling() {
		System.out.println("Calling using Airtel");
	
		
	}

	public String data() {
		return "dialy 1.5 GB of data can be used";
		
	}

}
