package com.objectmaster.om;

public class Human {

	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	
	public int health = 100;
	
	public int displayHealth() {
		System.out.println("Health level: " + this.health);
		return this.health;
		
	}
	
	public void attackHuman(Human attacked) {
		attacked.health -= this.health; 
		System.out.println("Attack!");
		System.out.println("Attacker health is: " + this.health);
		System.out.println("Attacked health is: " + attacked.health);
		
	}
		
	
}