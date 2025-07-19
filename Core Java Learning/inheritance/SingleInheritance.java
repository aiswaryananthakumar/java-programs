package com.techitactcorejavalearning.inheritance;
	class Bird {
	    void fly() {
	        System.out.println("Birds can fly.");
	    }

	    void layEggs() {
	        System.out.println("Birds lay eggs.");
	    }
	}
	class Sparrow extends Bird {
	    void chirp() {
	        System.out.println("Sparrow chirps.");
	    }
	}

	public class SingleInheritance {
	    public static void main(String[] args) {
	        
	        Sparrow sparrow = new Sparrow();
	        
	        sparrow.fly();
	        sparrow.layEggs();
	        
	        sparrow.chirp();
	    }
	}


