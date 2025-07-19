package Task1;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
	        int num = sc.nextInt();
	        int count = 0;
	        for (int i = 0; i < num; i++) {
	            int number = sc.nextInt();  

	            for (int j = 1; j * j <= number; j++) {
	                if (j * j == number) {
	                    count++;
	                    break; 
	                }
	            }
	        }

	        System.out.println(count);
	        sc.close();
	}

}
