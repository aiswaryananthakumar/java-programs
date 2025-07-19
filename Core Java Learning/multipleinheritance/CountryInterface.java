package com.techitactcorejavalearning.multipleinheritance;

public interface CountryInterface extends TamilNadu,Kerala {
	
	 public void aadharCard();
		
		public String PANCard();
		
		public void education();
		
		public void car();
		
		public int festivals(String fName);
		
		public static void food() {
			System.out.println("food in CountryInterface");
		}
		
		public default void language() {
			System.out.println("CountryInterface language");
		}

}
