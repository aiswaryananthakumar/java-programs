package Task1;

import java.util.Scanner;

public class MissCounter {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();

		        int missCount = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if (!(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))) {
		                missCount++;
		            }
		        }

		        System.out.println(missCount);
		        sc.close();
		    }

}
