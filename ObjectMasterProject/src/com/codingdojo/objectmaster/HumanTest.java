package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		// attack each other
		h1.attack(h2);
		h2.attack(h1);
		h2.attack(h1);
		
		// show health
		System.out.println(h1.getHealth());
		System.out.println(h2.getHealth());
		

	}

}
