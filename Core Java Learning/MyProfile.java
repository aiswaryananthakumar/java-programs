package com.techitactcorejavalearning;

import java.util.Scanner;

public class MyProfile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your first name: ");
        String firstName = scanner.next(); 

        System.out.print("Enter your last name: ");
        String lastName = scanner.next(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter your height in cm: ");
        float height = scanner.nextFloat(); 

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble(); 

        System.out.print("Enter your gender (Male/Female): ");
        char gender = scanner.next().charAt(0); 

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); 

        scanner.nextLine(); 

        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine(); 

        System.out.print("Enter your address: ");
        String address = scanner.nextLine(); 
        
        System.out.print("Enter your mobile number: ");
        long mobileNumber = scanner.nextLong(); 

        System.out.print("Enter your lucky number: ");
        short luckyNumber = scanner.nextShort(); 

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble(); 

        
        System.out.println("\n--- My Profile ---");
        System.out.println("My Full Name is: " + firstName + " " + lastName);
        System.out.println("My Age is: " + age + " years");
        System.out.println("My Height is: " + height + " cm");
        System.out.println("My Weight is: " + weight + " kg");
        System.out.println("My Gender is: " + gender);
        System.out.println("Student: " + isStudent);
        System.out.println("My Hobby is: " + hobby);
        System.out.println("My Address is: " + address);
        System.out.println("My Mobile Number is: " + mobileNumber);
        System.out.println("My Lucky Number is: " + luckyNumber);
        System.out.println("My CGPA is: " + cgpa);

        scanner.close(); 
    
	}

}
