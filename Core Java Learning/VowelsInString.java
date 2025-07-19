package com.techitactcorejavalearning;
import java.util.Scanner;
public class VowelsInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Vowels of a String: ");
        
        for (char ch : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}
