package Task1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();          
        int[] arr = new int[n]; 
       // int digit = 0;
       // int sumOdd = 0, sumEven = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
            	//sumEven += digit;
            	//sumEven++;
                System.out.print(arr[i] + " ");
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
            	//sumOdd += digit;
            	//sumOdd--;
                System.out.print(arr[i] + " ");
                sc.close();
            }
        }            
    }
}