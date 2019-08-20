package com.objectmaster.om;

public class Samurai extends Human {

	static int totalSamurai = 0;
			
	public Samurai() {
		super();
		this.health = 200;
		totalSamurai += 1;
		// TODO Auto-generated constructor stub
	}

	
	public void deathBlow(Human attacked) {
		attacked.health = 0;
		this.health -= this.health/2;
	}

		
	public void ninjaRun() {
		this.health -= 10;
	}
	
	public void meditate() {
		this.health = 200;
	}
	
	public void howMany() {
		System.out.println("Total number of Samurai: " + Samurai.totalSamurai);
	}
}



//
//---> howMany that returns the current number of Samurai