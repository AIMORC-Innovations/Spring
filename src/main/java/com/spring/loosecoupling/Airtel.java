package com.spring.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;

public class Airtel implements Sim {
	
	
	public void calling() {
		System.out.println("Calling using Airtel");
	
		
	}

	public void data() {
		System.out.println("Streaming using Airtel");
		
	}

}
