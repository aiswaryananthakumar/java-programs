package com.techitactcorejavalearning.abstraction;

public abstract class AbstractClassEx {
	
	public int display() {
		System.out.println("This is display method in abstract class");
		return 0;
	}
	
	public static void add(int a, String name) {
		System.out.println("addition in abstract class");
	}
	
	public abstract void sub();  //abstarct -->summary
	
	public abstract String mul();
	
	// public static void div();

	public AbstractClassEx() {
		System.out.println("constructor in AbstractClassEx");
	}
}
