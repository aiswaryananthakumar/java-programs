package com.techitactcorejavalearning;

public class FiveStudentValue {
	
	static int a=2;
	int b = 5;
	
	void m() {
		a++;
		b++;
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
		FiveStudentValue obj = new FiveStudentValue();
		obj.m();   //same object with it call it so it will override
		

		FiveStudentValue obj1 = new FiveStudentValue();
		obj1.m();
		

		FiveStudentValue obj2 = new FiveStudentValue();
		obj2.m();
		

		FiveStudentValue obj3 = new FiveStudentValue();
		for(int i=0;i<=5;i++) {
			obj3.m();
		}
	

	}

}
