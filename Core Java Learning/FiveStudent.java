package com.techitactcorejavalearning;

public class FiveStudent {
	
	static String clgName = "KNCET";
	int b = 5;
	
	void m(String sName,int number,int age) {
		
		System.out.println(sName+" "+number+" "+age+" "+clgName);
	}

	public static void main(String[] args) {
		 
		FiveStudent obj = new FiveStudent();
		obj.m("a",30, 20);
		
		FiveStudent obj1 = new FiveStudent();
		obj1.m("b",340, 19);
		
		FiveStudent obj2 = new FiveStudent();
		obj2.m("c",360, 23);
	}

}
