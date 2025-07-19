package com.techitactcorejavalearning.multipleinheritance;

public class Country implements TamilNadu,Kerala{
	
	public static void main(String[] args) {
		
		Country obj=new Country();
		obj.aadharCard();
		obj.carBrand();
		obj.display();
		obj.education();
		obj.PANCard();
		obj.language();
		
		System.out.println();
		
		TamilNadu obj1=new Country();
		obj1.aadharCard();
		obj1.education();
		obj1.PANCard();
		obj1.language();
		
		
		System.out.println();
		
		Kerala obj2=new Country();
		obj2.aadharCard();
		obj2.carBrand();
		obj2.PANCard();
		obj2.education();	
		
	}

	@Override
	public void carBrand() {
		// TODO Auto-generated method stub
		System.out.println("car method");
	}

	@Override
	public void aadharCard() {
		// TODO Auto-generated method stub
		System.out.println("aadhar card method");
	}

	@Override
	public String PANCard() {
		// TODO Auto-generated method stub
		System.out.println("pan card method");
		return null;
	}

	@Override
	public void education() {
		// TODO Auto-generated method stub
		System.out.println("education method");
	}

	@Override
	public void language() {
		// TODO Auto-generated method stub
		TamilNadu.super.language();
	}
	
	public void display() {
		Kerala.super.language();
	}

}
