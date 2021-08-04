package com.codingdojo.objectmaster;

public class Wizard extends Human{
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	// heal human by wizard intelligence
	public void healHuman(Human human) {
		human.health += this.intelligence;
	}
	
	// fire ball attack decreases health by intelligence * 3
	public void fireball(Human human) {
		human.health -= (this.intelligence * 3);
	}
	
	//
	
	
}
