package Task1;

import java.util.Scanner;

public class OddEven {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
	        int n = sc.nextInt();          
	        int[] arr = new int[n];         

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 != 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        sc.close();
	    }
	}
