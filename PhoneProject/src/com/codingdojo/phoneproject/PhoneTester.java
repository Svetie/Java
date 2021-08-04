package com.codingdojo.phoneproject;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");
		
		s9.displayInfo();						// Galaxy S9 from Verizon
		
		System.out.println(s9.ring());			// Galaxy S9 says Ring Ring Ring!
		System.out.println(s9.unlock());		// Unlocking via finger pring
		
		iphoneTen.displayInfo();				// IPhone X from AT&T
		
		System.out.println(iphoneTen.ring());	// IPhone X says Zing
		System.out.println(iphoneTen.unlock());	// Unlocking via facial recognition

	}

}
