package Task1;

import java.util.Scanner;

public class LeftToRight {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt(), a[] = new int[n];
		        for (int i = 0; i < n; i++) {
		        	a[i] = sc.nextInt();
		        }
		        int k = sc.nextInt() % n;

		        for (int i = 0; i < k; i++) {
		            int last = a[n - 1];
		            for (int j = n - 1; j > 0; j--) {
		            	a[j] = a[j - 1];
		            }
		            a[0] = last;
		        }

		        for (int x : a) {
		        	System.out.print(x + " ");
		        }
		        sc.close();
		    }
		}