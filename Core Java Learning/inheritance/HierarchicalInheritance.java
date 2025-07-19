package com.techitactcorejavalearning.inheritance;
class Vehicle {
 void start() {
     System.out.println("Vehicle is starting.");
 }
 void stop() {
     System.out.println("Vehicle is stopping.");
 }
}

class Car extends Vehicle {
 void drive() {
     System.out.println("Car is driving.");
 }
 void honk() {
     System.out.println("Car is honking.");
 }
}

class Truck extends Vehicle {
 void loadCargo() {
     System.out.println("Truck is loading cargo.");
 }
 void unloadCargo() {
     System.out.println("Truck is unloading cargo.");
 }
}

class Motorcycle extends Vehicle {
 void ride() {
     System.out.println("Motorcycle is riding.");
 }
 void revEngine() {
     System.out.println("Motorcycle is revving the engine.");
 }
}

public class HierarchicalInheritance {
 public static void main(String[] args) {
     
     Car car = new Car();
     Truck truck = new Truck();
     Motorcycle motorcycle = new Motorcycle();
     System.out.println();

     car.start();
     truck.start();
     motorcycle.start();
     System.out.println();
     
     car.stop();
     truck.stop();
     motorcycle.stop();
     System.out.println();
     
     car.drive();
     car.honk();
     System.out.println();

     truck.loadCargo();
     truck.unloadCargo();
     System.out.println();

     motorcycle.ride();
     motorcycle.revEngine();
 }
}
