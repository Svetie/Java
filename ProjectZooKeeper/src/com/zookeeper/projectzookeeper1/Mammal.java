package com.zookeeper.projectzookeeper1;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Energy level is: " + energyLevel);
		return this.energyLevel;
	}
}
