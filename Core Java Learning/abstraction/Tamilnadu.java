package com.techitactcorejavalearning.abstraction;

public class Tamilnadu extends Country{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country tn = new Tamilnadu();
        System.out.println("Tamil Nadu");
        
        tn.AadharCard();
        tn.PanCard();
        tn.Education();
        tn.stateFood();
        tn.stateLanguage();
        tn.stateFestivals();
        tn.stateCarBrands();

	}
	 
	    @Override
	    public void stateFood() {
	        System.out.println("Food: Idli, Dosa, Sambar, Pongal.");
	    }

	    @Override
	    public void stateLanguage() {
	        System.out.println("Language: Tamil.");
	    }

	    @Override
	    public void stateFestivals() {
	        System.out.println("Festivals: Pongal, Tamil New Year.");
	    }
	    
	    @Override
	    public void stateCarBrands() {
	        System.out.println("Car Brands: Honda, Scooty");
	    }
	}