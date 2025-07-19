package com.techitactcorejavalearning.interfaceEx;

import java.util.Scanner;

public class Laptop implements LaptopEx {
	
	public static void main(String args[]) {
		
		LaptopEx obj = new Laptop();
		
		obj.laptopModel();
		obj.keyboard();
		obj.monitor();
		obj.mouse("java");
		LaptopEx.display();
		Laptop obj1=new Laptop();
		obj1.studentDetails();
		
	}
	
	public void laptopModel() {
		System.out.println("laptopModel");
	}
	
	public String keyboard() {
		System.out.println("laptopModel");
		return "interfaceLearning";
	}
	
	public void mouse(String name) {
		System.out.println("laptopModel");
	}
	
	public void studentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		System.out.println("sc.nextLine()");
		sc.close();
	}

}
