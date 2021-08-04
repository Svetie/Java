package com.zookeeper.projectzookeeper1;

public class Bat extends Mammal {
	
	// constructor
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Wings flapping");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Oops");
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Buildings falling, fire burning..");
	}
}
	
	

