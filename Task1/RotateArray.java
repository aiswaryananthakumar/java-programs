package Task1;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();
        int k = sc.nextInt() % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int x : arr) 
        	System.out.print(x + " ");
        sc.close();
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l++] = a[r];
            a[r--] = temp;
        }
    }
}        