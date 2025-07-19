package com.techitactcorejavalearning;

import java.util.Scanner;

public class SampleArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

        /*System.out.println("Enter Array Size:");

        int regno = sc.nextInt();

        int[] arr=new int[regno];

        for(int i=0;i<regno;i++) {
            System.out.println("Element:" + (i+1) +":");
            arr[i]=sc.nextInt();*/
		
		int reg[] = new int[10];
		
		reg[0] = 1001;
		reg[1] = 2001;
		reg[2] = 3001;
        reg[3] = 4001;
        reg[4] = 5001;
        
        for(int i1=0;i1<reg.length;i1++) {
        	if(i1<4) {
        		reg[i1] = sc.nextInt();
        	}
        	System.out.println("reg : "+reg[i1]);
        	System.out.println("reg : "+reg[i1]);
        }
        
      //  System.out.println("reg 0: "+reg[0]);
      //  System.out.println("reg 1: "+reg[1]);
      //  System.out.println("reg 2: "+reg[2]);
      //  System.out.println("reg 3: "+reg[3]);
      //  System.out.println("reg 4: "+reg[4]);
        
        sc.close();
	}

	}

