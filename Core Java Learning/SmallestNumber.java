package com.techitactcorejavalearning;
import java.util.Scanner;
public class SmallestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }
		

		        int smallest = arr[0];
		        for (int i = 1; i < n; i++) {
		            if (arr[i] < smallest) {
		                smallest = arr[i];
		            }
		        }

		        System.out.println("Smallest number: " + smallest);
		        scanner.close();
		    }
		}

