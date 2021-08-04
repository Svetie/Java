package com.zookeeper.projectzookeeper1;

public class BatTest {

	public static void main(String[] args) {
		Bat giant = new Bat();
		
		// attack 3 towns
		giant.attackTown();
		giant.attackTown();
		giant.attackTown();
		
		// eat 2 humans
		giant.eatHumans();
		giant.eatHumans();
		
		// fly 
		giant.fly();
		giant.fly();
		
		giant.displayEnergy();

	}

}
