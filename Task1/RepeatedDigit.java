package Task1;

import java.util.Scanner;

public class RepeatedDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
       
                long num = sc.nextLong();  
                int[] arr = new int[10];
                while (num > 0) {
                    int digit = (int)(num % 10);
                    arr[digit]++;
                    num /= 10;
                }
                int count = 0;
                for (int i = 0; i < 10; i++) {
                    if (arr[i] > 1) {
                        count++;
                    }
                }
                if (count == 0)
                    System.out.println(-1);
                else
                    System.out.println(count);

                sc.close();
            }

	}		 