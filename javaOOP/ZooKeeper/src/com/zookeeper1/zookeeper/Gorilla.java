package com.zookeeper1.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla has thrown something.");
	}
	
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla has eaten a banana.");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla has climed a tree.");
	}
	
	

}