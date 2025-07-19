package com.techitactcorejavalearning.interfaceEx;

public interface LaptopEx {
	
	public void laptopModel();
	
	public String keyboard();
	
	public void mouse(String name);
	
	public static void display() {
		System.out.println("This is display method");
	}
	
	public default void monitor() {   //it possible only interface
		System.out.println("This is monito");
	}

}
