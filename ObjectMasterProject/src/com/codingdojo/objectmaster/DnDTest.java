package com.codingdojo.objectmaster;


public class DnDTest {
	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		Wizard wizard = new Wizard();
		
		System.out.println("Ninjas health is " + ninja.getHealth());
		System.out.println("sam's health is " + samurai.getHealth());
		
		ninja.steal(samurai);
		System.out.println("Ninjas health is " + ninja.getHealth());
		System.out.println("sam's health is " + samurai.getHealth());
		
		samurai.meditate();
		System.out.println("sam's health is after meditating " + samurai.getHealth());
		
		wizard.fireball(ninja);
		System.out.println("ninja after fireball " + ninja.getHealth());
		
		
	}
}
