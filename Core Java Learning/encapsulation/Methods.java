package com.techitactcorejavalearning.encapsulation;

class Bank{
	private int balance;
	private int accountNumber;
	private String holder;
	
	public int getbalance() {
		return balance;	                    
	}

	public void setbalance(int balance) {   
		this.balance = balance;
	}
	
	public int getaccountNumber() {
		return accountNumber;	                    
	}

	public void setaccountNumber(int accountNumber) {   
		this.accountNumber = accountNumber;
	}
	
	 public String getholder() { 
		 return holder;
		 }
	  
	 public void setholder(String holder) {
		 this.holder = holder; 
		 }
	
	 void deposit(int amount) {
		 balance+=amount;
	  System.out.println(amount); 
	  }
	void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount);
	}
	void display() {
		System.out.println("balance: " +balance);
		System.out.println("accountNumber: " +accountNumber);
		System.out.println("holder: " +holder);
	}
	
}

public class Methods {

	public static void main(String[] args) {
		Bank a = new Bank();
		a.setaccountNumber(1);
		a.setbalance(10000);
		a.setholder("Aiswarya");
		a.deposit(1000);
		a.withdraw(500);
		a.display();

	}

}
