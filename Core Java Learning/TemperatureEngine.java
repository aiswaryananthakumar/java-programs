package com.techitactcorejavalearning;

import java.util.Scanner;

public class TemperatureEngine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter engine temperature: ");

        if (scanner.hasNextInt()) {
            int temperature = scanner.nextInt();

            if (temperature < -50 || temperature > 200) {
                System.out.println("Invalid");
            } else {
                
                if (temperature < 0) {
                    System.out.println("Sensor Error: Temperature reading invalid");
                } else if (temperature <= 69) {
                    System.out.println("Display: Engine cold allow engine to warm up");
                } else if (temperature <= 100) {
                    System.out.println("Display: Engine temperature normal");
                } else if (temperature <= 120) {
                    System.out.println("Warning: Engine heating up monitor closely");
                } else if (temperature <= 150) {
                    System.out.println("Critical: Engine overheating stop and check");
                } else {
                    System.out.println("System Alert: Potential engine fire risk");
                }
            }
        } else {
            System.out.println("Invalid Input"); 
        }

        scanner.close();
    }
}	        