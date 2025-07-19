package com.techitactcorejavalearning.multipleinheritance;

public interface TamilNadu {  //parent a
	
	public void aadharCard();
	
	public String PANCard();
	
	public void education();
	
	public static void display() {
		System.out.println("food in Tamil Nadu");
	}
	
	public default void language() {
		System.out.println("TamilNadu language");
	}

	public static void food() {
		System.out.println("TamilNadu food");
		
	}

}
