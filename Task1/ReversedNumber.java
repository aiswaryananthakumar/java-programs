package Task1;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextLong();  
        long reverse = 0;

        while (num > 0) {
            long digit = num % 10;       
            reverse = reverse * 10 + digit;  
            num = num / 10;             
        }

        System.out.println(reverse);    
        sc.close();
	}

}
