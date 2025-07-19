package com.techitactcorejavalearning;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345;

        int reversed = 0;
       
        while (num != 0) {
            int digit = num % 10;
            
            if(digit % 2 == 0){
            	System.out.println("It is even number: " +digit);
            }else {
            	System.out.println("It is odd number: " +digit);
            }
            reversed = reversed * 10 + digit;
            num /= 10;
            
        }

        System.out.println("Reversed number: " + reversed);
        System.out.println('a'+'a'+"a"+'a');
        
      
    }
}