package com.techitactcorejavalearning;

import java.util.Scanner;

public class WholeNumbers {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        for (int i = 1; i <= number; i++) {
	            System.out.print(i + " ");
	        }
	        scanner.close();
	    }
}
