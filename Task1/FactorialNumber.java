package Task1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number: ");
	        int num = sc.nextInt();  

	        int count = 0;

	        for (int i = 5; i <= num; i *= 5) {
	            count += num / i;
	        }

	        System.out.println(count);
	        sc.close();
	    }
}
