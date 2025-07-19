package com.techitactcorejavalearning.interfaceEx;

interface Hotel1{
	int dosaPrice = 50;
	
	default void dosa() {
		System.out.println("Dosa With Chicken Gravyy!!");
	}
	abstract void sambar();  //public abstract
}

abstract class Kitchen1 implements Hotel1{	
}

class Home1 implements Hotel1{
	@Override
	public void sambar() {  //public only access
		System.out.println("Special Masala");		
	}	
}

public class Interface {
	public static void main(String[] args) {
		Hotel1 a2b = new Home1();
		a2b.dosa();
		//System.out.println(a2b.dosaPrice);
	}
}
