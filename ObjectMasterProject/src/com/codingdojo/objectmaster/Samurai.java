package com.codingdojo.objectmaster;

public class Samurai extends Human{
	public static int samuraiCount = 0;
	
	// constructor
	public Samurai() {
		this.health = 200;
		samuraiCount++;
	}
	
	// kill opponent, lose health by 50%
	public void deathBlow(Human human) {
		human.health = 0;
		this.health /= 2;
	}
	
	// meditate, regain health by 50%
	public void meditate() {
		this.health += (this.health * 0.5);
	}
	
	// count instances of samurai
	public int howMany() {
		return samuraiCount;
	}
}
