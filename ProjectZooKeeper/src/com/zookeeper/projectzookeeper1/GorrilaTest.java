package com.zookeeper.projectzookeeper1;

public class GorrilaTest {

	public static void main(String[] args) {
		// test gorilla
		Gorilla gorilla = new Gorilla();
		
		// throw three things
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();	
		
		// eat bananas twice
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		// climb
		gorilla.climb();
		
		gorilla.displayEnergy();
		
		

	}

}
