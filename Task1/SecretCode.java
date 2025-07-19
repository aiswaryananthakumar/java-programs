package Task1;

import java.util.Scanner;

public class SecretCode {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the message: ");
		        String message = scanner.nextLine();

		        int count = 0;

		        for (int i = 0; i < message.length(); i++) {
		            char ch = message.charAt(i);

		            if (!Character.isLetterOrDigit(ch)) {
		                count++;
		            }
		        }

		        System.out.println("Number of special characters and whitespaces: " + count);
		        
		        scanner.close();
		    }
}
