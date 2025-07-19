package Task1;

import java.util.Scanner;

public class OddEvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long bill = sc.nextLong(); 

        int sumOdd = 0, sumEven = 0;

        while (bill > 0) {
            int digit = (int)(bill % 10); 

            if (digit % 2 == 0) {
                sumEven += digit;        
            } else {
                sumOdd += digit;         
            }

            bill = bill / 10;           
        }

        int discount = sumOdd * sumEven;  
        System.out.println(discount);  
        sc.close();
	}

}
