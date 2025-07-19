package MNCCode;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		 Scanner scr = new Scanner(System.in);
	        int n = scr.nextInt();
	        int[] a = new int[n];
	        for(int i = 0; i < n; i++) {
	        	a[i] = scr.nextInt();
	        }
	        int mode = scr.nextInt(), sum = 0;

	        for(int i = 0; i < n; i++) {
	            if(mode == 1 && isPrime(i)) sum += a[i];
	            if(mode == 2 && !isPrime(i)) sum += a[i];
	        }
	        System.out.println(sum);
            scr.close();
	    }

	    static boolean isPrime(int n) {
	        if(n < 2) return false;
	        for(int i = 2; i <= n / 2; i++)
	            if(n % i == 0) return false;
	        return true;
	    }       
}
