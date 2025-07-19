package com.techitactcorejavalearning;

import java.util.Scanner;

public class TemperatureTrendAnalyser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number: ");
		int n = sc.nextInt();

	        int[] tt = new int[n];
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        double sum = 0;

	        for (int i = 0; i < n; i++) {
	            tt[i] = sc.nextInt();
	            if (tt[i] > max) {
	                max = tt[i];
	            }
	            if (tt[i] < min) {
	                min = tt[i];
	            }
	            sum += tt[i];
	        }

	        double average = sum / n;
	        System.out.println(max);
	        System.out.println(min);
	        System.out.printf("%.1f\n", average);
	        
	        sc.close();
	    }
	}		       