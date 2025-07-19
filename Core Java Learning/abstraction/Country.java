package com.techitactcorejavalearning.abstraction;

public abstract class Country {


	    public void AadharCard() {
	        System.out.println("Aadhar Card");
	    }

	    public void PanCard() {
	        System.out.println("PAN Card");
	    }

	    public void Education() {
	        System.out.println("Education");
	    }

	    public abstract void stateFood();  
	    
	    public abstract void stateLanguage();  
	    
	    public abstract void stateFestivals();
	    
	    public abstract void stateCarBrands();

	    public Country() {
	        System.out.println("Constructor in Country class");
	    }
	    
	    }

