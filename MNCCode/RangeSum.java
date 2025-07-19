package MNCCode;

import java.util.Scanner;

public class RangeSum {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

        int i = scr.nextInt();
        int j = scr.nextInt();
        int sumi = i * (i - 1) / 2;
        int sumj = j * (j + 1) / 2;
        int result = sumj - sumi;

        if (i < 0 || j > 9999 || i >= j) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(result);
        } 
        scr.close();

	}

}
