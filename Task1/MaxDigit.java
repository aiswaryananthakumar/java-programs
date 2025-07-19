package Task1;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 long itemID = sc.nextLong();  
	        int maxDigit = 0;

	        while (itemID > 0) {
	            int digit = (int)(itemID % 10);

	            if (digit > maxDigit) {
	                maxDigit = digit;
	            }

	            itemID = itemID / 10;
	        }

	        System.out.println(maxDigit); 

	        sc.close();
	}
}