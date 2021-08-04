package com.codingdojo.objectmaster;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human human) {
		System.out.println(this.stealth);
		human.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runaway() {
		this.health -=10;
	}
}
