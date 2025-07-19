package com.techitactcorejavalearning.inheritance;

public class Parent {

	int worth=1000000;
	public void farm() {
		System.out.println("This is farm method in parent class");
		Parent obj=new Parent();
		System.out.println("farm worth:" + obj.worth);
	}

}
