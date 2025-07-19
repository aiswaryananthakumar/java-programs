package com.techitactcorejavalearning.inheritance;
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
 void sleep() {
     System.out.println("This animal sleeps.");
 }
}

class Mammal extends Animal {
 void walk() {
     System.out.println("Mammals can walk.");
 }
}

class Dog extends Mammal {
 void bark() {
     System.out.println("The dog barks.");
 }
 void wagTail() {
     System.out.println("The dog wags its tail.");
 }
}

public class MultilevelInheritance {
 public static void main(String[] args) {
     
     Dog dog = new Dog();
  
     dog.eat();
     dog.sleep();
     System.out.println();
   
     dog.walk();
     System.out.println();
   
     dog.bark();
     dog.wagTail();
 }
}
