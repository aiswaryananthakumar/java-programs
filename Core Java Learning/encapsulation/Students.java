package com.techitactcorejavalearning.encapsulation;

import java.util.Scanner;

public class Students extends StudentBo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter ur rollNo");
		
		int no=sc.nextInt();
		
		StudentBo obj=new StudentBo();
		
		obj.setStudentId(no);
		obj.setName("james");
		obj.setEmailAddress("james@gmail.com");
		
	    int rollNo=obj.getStudentId();
	    String name=obj.getName();
	    //String email=obj.getEmailAddress();
	    
	    System.out.println("Student Roll No is:"  + rollNo);
	    System.out.println("Student Name is:"  + name);
	    System.out.println("Student email Address is:"  + obj.getEmailAddress());
	    
	    System.out.println();
	    obj.setStudentId(102);;
	    obj.setName("gosling");
	    obj.setEmailAddress("gosling");
	    
	    System.out.println("Student Roll No is:"  + obj.getStudentId());
	    System.out.println("Student Name is:"  + obj.getName());
	    System.out.println("Student email Address is:"  + obj.getEmailAddress());
	    
	    
	    String[]  arr=new String[2];
	    
	    arr[0]=name;
	    arr[1]=obj.getName();
	    
	    System.out.println();
	    System.out.println("encapsulation using array: " + arr[0]);
	    
	    sc.close();

	}

	
}
