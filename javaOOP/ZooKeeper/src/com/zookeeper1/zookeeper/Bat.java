package com.zookeeper1.zookeeper;

public class Bat extends Mammal{


	public Bat() {
			super();
			this.energyLevel = 300;
			// TODO Auto-generated constructor stub
	}
	
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Bat has taken flight.");
	}
	
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Bat has feasted on a human.");
	}
	
	public void attackTown() {
		this.energyLevel += 100;
		System.out.println("Bat has attacked a town.");
	
	}
	
}