package com.techitactcorejavalearning.abstraction;

public class AbstractMain extends AbstractClassEx {
	
	public static void main(String args[]) {
		AbstractClassEx obj=new AbstractMain();
		
		obj.display();
		AbstractClassEx.add(20,"java");
		obj.sub();
		obj.mul();
		AbstractMain.div();
	}
	public void sub() {
		System.out.println("sub method in Abstract Main class");
		
		
	}
	
	public String mul() {
		System.out.println("mul method in Abstract Main class");
		return null;
	}

	public static void div() {
		System.out.println("div method in Abstract Main Class");
	}
}
