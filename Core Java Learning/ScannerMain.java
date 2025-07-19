package com.techitactcorejavalearning;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);
		
		    System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter your favorite number: ");
	        double favoriteNumber = scanner.nextDouble();
	        scanner.nextLine(); 
	        
	        System.out.print("Enter your favorite color: ");
	        String favoriteColor = scanner.nextLine();

	        System.out.print("Enter your hobby: ");
	        String hobby = scanner.nextLine();
	       
	        
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Favorite Number: " + favoriteNumber);
	        System.out.println("Favorite Color: " + favoriteColor);
	        System.out.println("Hobby: " + hobby);

	        
	        scanner.close();

	}

}
