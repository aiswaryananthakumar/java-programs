package Task1;

import java.util.Scanner;

public class AreaOfTriangle {
	Scanner sc=new Scanner(System.in);
	double length() {
		double length= sc.nextFloat();
		return length;
		}
	double breadth() {
		double breadth= sc.nextFloat();
		return breadth;
		}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		AreaOfTriangle obj=new AreaOfTriangle();
		AreaOfTriangle obj1=new AreaOfTriangle();
		double len1=obj.length();
		double len2=obj.breadth();
		double area=(len1*len2)/2;
		System.out.printf("Area of traingle:%.2f", +area);
		double len3=obj1.length();
		double len4=obj1.breadth();
		double area1=(len3*len4)/2;
		System.out.printf("Area of traingle:%.2f", +area1);
		System.out.println();
		if(area1>area) {
			System.out.printf("Highest is: %.2f",+area1);
		}
		else {
			System.out.printf("Highest is: %.2f",+area);
		}
		
	}
	}