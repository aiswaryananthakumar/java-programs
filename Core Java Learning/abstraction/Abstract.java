package com.techitactcorejavalearning.abstraction;

abstract class Hotel{
	int dosaPrice = 50;
	void dosa() {
		System.out.println("Dosa Batter + salt");
	}
	abstract void sambar();
}

abstract class Kitchen extends Hotel{
	
}
class Home extends Hotel{

	@Override
	void sambar() {
		System.out.println("Special Masala");
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		Hotel a2b = new Home();
		a2b.dosa();
		a2b.dosaPrice = 100;
		System.out.println(a2b.dosaPrice);

	}
}
