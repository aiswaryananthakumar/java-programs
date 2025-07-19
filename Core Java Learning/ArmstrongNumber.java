package com.techitactcorejavalearning;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        StringBuilder sb = new StringBuilder(numberStr);

        int numDigits = sb.length();
        int sum = 0;
        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(sb.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        String sumStr = String.valueOf(sum);
        if (sumStr.equals(numberStr)) {
            System.out.println(numberStr + " is an Armstrong number.");
        } else {
            System.out.println(numberStr + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
