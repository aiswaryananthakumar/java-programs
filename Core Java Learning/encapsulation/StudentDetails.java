package com.techitactcorejavalearning.encapsulation;
public class StudentDetails {
	    public static void main(String[] args) {	       
	        Student student = new Student();

	        student.setName("Aiswarya Nanthakumar");
	        student.setAge(19);
	        student.setGender("Female");
	        student.setStudentId("430002");
	        student.setDepartment("Artificial Intelligence And Data Science");
	        student.setEmail("aishu@gmail.com");
	        student.setPhoneNumber("951457956625");
	        student.setAddress("003 xyz Street, Musiri, Trichy");
	        student.setGpa(9.1);
	        student.setGrade("O+");
	        student.setNationality("Indian");
	        student.setEnrollmentYear("2022");
	        student.setMajor("Artificial Intelligence");
	        student.setMinor("Robotics");

	        System.out.println("Student Details:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	        System.out.println("Gender: " + student.getGender());
	        System.out.println("Student ID: " + student.getStudentId());
	        System.out.println("Department: " + student.getDepartment());
	        System.out.println("Email: " + student.getEmail());
	        System.out.println("Phone Number: " + student.getPhoneNumber());
	        System.out.println("Address: " + student.getAddress());
	        System.out.println("GPA: " + student.getGpa());
	        System.out.println("Grade: " + student.getGrade());
	        System.out.println("Nationality: " + student.getNationality());
	        System.out.println("Enrollment Year: " + student.getEnrollmentYear());
	        System.out.println("Major: " + student.getMajor());
	        System.out.println("Minor: " + student.getMinor());
	    }
	}