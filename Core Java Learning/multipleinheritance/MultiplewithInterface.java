package com.techitactcorejavalearning.multipleinheritance;

public class MultiplewithInterface implements TamilNadu,Kerala,CountryInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiplewithInterface obj=new MultiplewithInterface();
		obj.aadharCard();
		obj.car();
		obj.education();
		obj.festivals("pongal");
		obj.PANCard();
		
		System.out.println();
		TamilNadu.food();	
		obj.display();
		System.out.println();
		obj.language();
		
		
		//TamilNadu obj1=new MultiplewithInterface();  //loosely coupling
		

	}

	@Override
	public void aadharCard() {
		// TODO Auto-generated method stub
		
		System.out.println("Aadharcard ");
		
	}

	@Override
	public String PANCard() {
		// TODO Auto-generated method stub
		System.out.println("PANCard");
		return "Multiple using Interface";
	}

	@Override
	public void education() {
		// TODO Auto-generated method stub
		
		System.out.println("PANCard");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}

	@Override
	public int festivals(String fName) {
		// TODO Auto-generated method stub
		System.out.println("festivals");
		
		return 0;
	}
	
	
	public void display() {
		System.out.println("display for default method");
		CountryInterface.super.language();
	}

	@Override
	public void carBrand() {
		// TODO Auto-generated method stub
		
	}

}
