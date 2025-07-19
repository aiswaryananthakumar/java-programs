package Task1;

import java.util.Scanner;

public class GradeERP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int erp = sc.nextInt();  

        if (erp >= 81 && erp <= 100) {
            System.out.println("A");
        }
        if (erp >= 61 && erp <= 80) {
            System.out.println("B");
        }
        if (erp >= 51 && erp <= 60) {
            System.out.println("C");
        }
        if (erp >= 30 && erp <= 50) {
            System.out.println("D");
        }

        sc.close();
	}

}
