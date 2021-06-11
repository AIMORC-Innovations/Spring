package com.spring.loosecoupling;

public class Mobile {

	private Sim sim;

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void calling() {
		sim.calling();

	}

	public void data() {
		sim.data();
	}

}
