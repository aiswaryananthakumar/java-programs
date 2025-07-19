package Task1;

import java.util.Scanner;

public class FourDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = sc.nextInt();  
        int digit = 0;
        
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;

        while (number > 0) {
            digit = number % 10;

            if (digit > num) {
                num = digit;
            }

            number = number / 10;
        }
		
		for(int i=0;i<=num ;i++) {
			
			if (1000<=num1 && num1<=9999) {
				num1 = 1000%10;
				System.out.println(num1);
			}
			else if(1000<=num2 && num2<=9999) {
				num2 = 1000%10;
				System.out.println(num2);
			}
			else if(1000<=num3 && num3<=9999) {
				num3 = 1000%10;
				System.out.println(num3);
			}
			else if(1000<=num4 && num4<=9999) {
				num4 = 1000%10;
				System.out.println(num4);
			}
			else {
				System.out.println(num);
			}
		}
		sc.close();
	}

}
