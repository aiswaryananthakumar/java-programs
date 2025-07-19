package com.techitactcorejavalearning;
import java.util.Scanner;
public class CopyArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arr1[] = {90, 80, 70, 60, 50, 40, 30, 20, 10};

        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Array 1: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
