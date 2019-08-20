package com.zookeeper1.zookeeper;

public class Mammal {

	public int energyLevel = 100;
	public int displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel);
		return this.energyLevel;
	}
}