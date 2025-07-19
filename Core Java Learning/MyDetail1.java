package com.techitactcorejavalearning;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDetail1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your first name: ");
            String firstName = scanner.next(); 

            System.out.print("Enter your last name: ");
            String lastName = scanner.next(); 

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age <= 0) throw new InputMismatchException("Age must be positive.");

            System.out.print("Enter your height in cm: ");
            float height = scanner.nextFloat();

            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your gender (M/F): ");
            char gender = scanner.next().charAt(0);
            if (gender != 'M' && gender != 'F') throw new InputMismatchException("Gender must be 'M' or 'F'.");

            System.out.print("Are you a student? (true/false): ");
            boolean isStudent = scanner.nextBoolean();

            scanner.nextLine(); // Consume newline

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

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
