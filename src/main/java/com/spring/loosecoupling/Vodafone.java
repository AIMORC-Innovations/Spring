package com.spring.loosecoupling;

public class Vodafone implements Sim {

	public void calling() {
		System.out.println("Calling using Vodafone");
		
	}

	public void data() {
		System.out.println("Streaming using Vodafone");
		
	}
}
