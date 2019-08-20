package com.objectmaster.om;

public class Ninja extends Human {

	public Ninja() {
		super();
		this.stealth = 10;
		// TODO Auto-generated constructor stub
	}

	public void ninjaRun() {
		this.health -= 10;
	}
	
	public void steal(Human stolen) {
		stolen.health -= this.stealth;
	}

}
