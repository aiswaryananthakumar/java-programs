package com.techitactcorejavalearning;
class Laptop {
 String brand; 
 String keyboardType;

 void showDetails() {
     System.out.println("Laptop Brand: " + brand);
     System.out.println("Keyboard Type: " + keyboardType);
     System.out.println("Laptop Brand1: " + brand);
     System.out.println("Keyboard Type1: " + keyboardType);
     System.out.println("Laptop Brand2: " + brand);
     System.out.println("Keyboard Type2: " + keyboardType);
     System.out.println("Laptop Brand3: " + brand);
     System.out.println("Keyboard Type3: " + keyboardType);
     System.out.println("--------------------------");
 }
}
public class LaptopMain {
 public static void main(String[] args) {
     
     Laptop myLaptop = new Laptop();
     Laptop myLaptop1 = new Laptop();
     Laptop myLaptop2 = new Laptop();
     Laptop myLaptop3 = new Laptop();

     myLaptop.brand = "HP";
     myLaptop.keyboardType = "Standard Keyboard";
     myLaptop1.brand = "Lenovo";
     myLaptop1.keyboardType = "Standard Keyboard";
     myLaptop2.brand = "Dell";
     myLaptop2.keyboardType = "Standard Keyboard";
     myLaptop3.brand = "Apple";
     myLaptop3.keyboardType = "Standard Keyboard";

     myLaptop.showDetails();
//     myLaptop1.showDetails();
  //   myLaptop2.showDetails();
    // myLaptop3.showDetails();
 }
}

