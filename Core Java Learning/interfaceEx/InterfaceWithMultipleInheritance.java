package com.techitactcorejavalearning.interfaceEx;

interface A{
	void run();
}
interface B{
	void run();
}
class C implements A,B{

	@Override
	public void run() {
		System.out.println("Running");
		
	}
	
}
public class InterfaceWithMultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.run();

	}

}
