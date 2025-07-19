package com.techitactcorejavalearning.interfaceEx;

interface A1{
	void walk();
}

interface B1{
	void walk();
}

class C1 implements A1, B1{
	public void walk() {
		System.out.println("Walking");		
	}
}

class D1 extends C1{
	
}

class E1 extends C1{
	
}

public class InterfaceWithHybridInheritance {
	public static void main(String[] args) {
		C1 c = new C1();
		c.walk();
	}
}