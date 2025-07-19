package Task1;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long bill = sc.nextLong();  
        int discount = 0;           

        while (bill > 0) {
            int d = (int) (bill % 10); 
            if (d % 2 != 0) {
                discount += d;     
            }
            bill = bill / 10;         
        }

        System.out.println(discount);  
        sc.close();
    }
}