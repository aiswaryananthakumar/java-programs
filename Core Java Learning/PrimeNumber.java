package com.techitactcorejavalearning;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int G = scanner.nextInt();
        if(G<=0) {
        	System.out.println("Invalid");
        }
        int count = 0;
        int num = 2;
        int p = 0;

        while (true) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
                if (count == G) {
                    p = num;
                    break;
                }
            }

            num++;
        }

        int sqrtP = (int) Math.sqrt(p);
        if (sqrtP * sqrtP == p) {
            
            String sqrtStr = Integer.toString(sqrtP);
            String reverseStr = new StringBuilder(sqrtStr).reverse().toString();

            if (sqrtStr.equals(reverseStr)) {
                System.out.println(101);
            } else {
                System.out.println(102);
            }

        } else {
            
            int sum = 0;
            int temp = p;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            boolean isSumPrime = true;
            if (sum <= 1) {
                isSumPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(sum); i++) {
                    if (sum % i == 0) {
                        isSumPrime = false;
                        break;
                    }
                }
            }

            if (isSumPrime) {
                System.out.println(204);
            } else {
                System.out.println(203);
            }
        }

        scanner.close();
	}     
}      