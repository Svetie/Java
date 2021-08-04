package com.zookeeper.projectzookeeper1;

public class Gorilla extends Mammal{
	
	// decrease energy by 5
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla threw something and its energy went down");
	}
	
	// increase energy by 10
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla ate banana and got some energy");
	}
	
	// decrease energy by 10 when climb
	public void climb() {
		this.energyLevel -=10;
		System.out.println("Gorilla climbed a tree");
	}
}
