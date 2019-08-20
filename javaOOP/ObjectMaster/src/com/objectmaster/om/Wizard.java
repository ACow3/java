package com.objectmaster.om;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.health = 50;
		this.intelligence = 8;
		// TODO Auto-generated constructor stub
	}

	public void healthHuman(Human healed) {
		healed.health += this.intelligence;
	}
	
	public void fireball(Human fireballed) {
		fireballed.health -= this.intelligence * 3;
	}
	
}