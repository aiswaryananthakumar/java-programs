package Task1;

import java.util.Scanner;

public class NuclearEnergy {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int initialEnergy = sc.nextInt();  
		        int rate = sc.nextInt();         
		        int time = sc.nextInt();          

		        int energy = initialEnergy;

		        for (int i = 0; i < time; i++) {
		            System.out.print(energy + " ");
		            energy *= rate;
		            sc.close();
		        }
		    }
}