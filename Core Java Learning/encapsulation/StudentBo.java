package com.techitactcorejavalearning.encapsulation;

public class StudentBo { //Encapsulation class //Bean Object // POJO class //Plain old java object
	
private int studentId;     //101
private String name;
private String emailAddress;
private String department;
private long mobileNo;

	

public int getStudentId() {
	return studentId;	                    //101
}

public void setStudentId(int studentId) {   //101
	this.studentId=studentId;
}

public String getName() {
	return name;
}

public void setName(String studentName) {
	this.name=studentName;
}

public String getEmailAddress() {
	return emailAddress;		
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress=emailAddress;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department=department;
}

public long getMobilNo() {
	return mobileNo;
}

public void setMobileNo(long mobileNo) {
	this.mobileNo=mobileNo;
}





}































/*
Encapsulation-->Wrapping code of data

Rule:

1.create separate class
2.must be private 
syntax:
private String name;
3.need to create getter and setter methods  //should be public
4.getter return type is datatype(based on datatype)
5.setter return is always void  


Get-->read the data
set-->write the data


1.getter method 
2.setter method





*/