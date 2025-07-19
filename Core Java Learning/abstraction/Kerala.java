package com.techitactcorejavalearning.abstraction;

public class Kerala extends Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kerala");
		Country kl = new Kerala();
       
        
        kl.AadharCard();
        kl.PanCard();
        kl.Education();
        kl.stateFood();
        kl.stateLanguage();
        kl.stateFestivals();
        kl.stateCarBrands();

	}

	    @Override
	    public void stateFood() {
	        System.out.println("Food: Kerala Sadya, Puttu & Kadala Curry, Appam & Stew.");
	    }

	    @Override
	    public void stateLanguage() {
	        System.out.println("Language: Malayalam.");
	    }

	    @Override
	    public void stateFestivals() {
	        System.out.println("Festivals: Onam, Vishu.");
	    }
	    
	    @Override
	    public void stateCarBrands() {
	        System.out.println("Car Brands: Honda, Scooty");
	    }
	}


