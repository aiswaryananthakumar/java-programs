package com.techitactcorejavalearning;
import java.util.Scanner;
public class HighestSalary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		        String[] names = {"Ram", "Karthik", "Guru", "Kumar", "Prabhu"};
		        String[] salaries = {"5000", "3000", "8000", "9000", "4000"}; 

		        StringBuilder highestSalaryHolder = new StringBuilder();
		        StringBuilder maxSalary = new StringBuilder(salaries[0]); 

		        for (int i = 0; i < salaries.length; i++) {
		            if (salaries[i].compareTo(maxSalary.toString()) > 0) {
		                maxSalary.setLength(0); 
		                maxSalary.append(salaries[i]); 
		                highestSalaryHolder.setLength(0); 
		                highestSalaryHolder.append(names[i]); 
		            }
		        }
		        System.out.println("Highest salary holder: " + highestSalaryHolder.toString() + " with salary " + maxSalary.toString());
		        scanner.close();
		    }
		}
