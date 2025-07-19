package com.techitactcorejavalearning.multipleinheritance;

public interface Kerala {    //parent b
	
public void aadharCard();
	
	public String PANCard();
	
	public void education();
	
	public void carBrand();
	
	public static void display() {
		System.out.println("food in Kerala");
	}
	
	public default void language() {
		System.out.println("Kerala language");
	}

}
