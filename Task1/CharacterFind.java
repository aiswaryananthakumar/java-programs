package Task1;

import java.util.Scanner;

public class CharacterFind {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        String sent = sc.next();
		        String received = sc.next();

		        if (sent.length() == received.length()) {
		            System.out.println("NA");
		            return;
		        }
		        int[] freq = new int[256]; 

		        for (char ch : sent.toCharArray()) {
		            freq[ch]++;
		        }
		        for (char ch : received.toCharArray()) {
		            freq[ch]--;
		        }
		        for (int i = 0; i < 256; i++) {
		            if (freq[i] > 0) {
		                System.out.println((char) i);
		                return;
		            }
		        }
		        System.out.println("NA");
		       sc.close();
	}
}
