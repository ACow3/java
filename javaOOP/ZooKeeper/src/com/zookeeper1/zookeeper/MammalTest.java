package com.zookeeper1.zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gorilla g = new Gorilla();
		Bat b = new Bat();
		
		g.displayEnergy();
		g.throwSomething();
		g.displayEnergy();
		g.throwSomething();
		g.throwSomething();
		g.displayEnergy();
		g.eatBananas();
		g.displayEnergy();
		g.climb();
		g.displayEnergy();
		b.displayEnergy();
		b.fly();
		b.displayEnergy();
		b.fly();
		b.eatHumans();
		b.fly();
		b.fly();
		b.attackTown();
		g.displayEnergy();
		b.displayEnergy();
	}

}
