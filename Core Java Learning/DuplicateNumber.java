package com.techitactcorejavalearning;

public class DuplicateNumber {
	    public static void main(String[] args) {
			/*
			 * char[] arr = {'a', 'b','a','c','c','b'}; // String[] arr1 = {"abc"};
			 */	 
	    	
	    	        String s = "aabcca";
	    	        char c[] = s.toCharArray();
	    	        
	    	        boolean foundDuplicate = false;

	    	        System.out.print("Duplicate elements: ");
	    	        
	    	        for (int i = 0; i < c.length; i++) {
	    	            for (int j = i + 1; j < c.length; j++) {
	    	                if (c[i] == c[j]) {
	    	                    System.out.print(c[i] + " ");
	    	                    foundDuplicate = true;
	    	                    break; 
	    	                }
	    	            }
	    	        }

	    	        if (!foundDuplicate) {
	    	            System.out.println("No duplicates found.");
	    	        }
	    	    }
	      }