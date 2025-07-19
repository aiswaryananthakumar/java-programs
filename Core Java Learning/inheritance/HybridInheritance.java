package com.techitactcorejavalearning.inheritance;
class Shape {
 void display() {
     System.out.println("This is a shape.");
 }

 void type() {
     System.out.println("General shape type.");
 }
}

//single inheritance
class TwoDimensionalShape extends Shape {
 void area() {
     System.out.println("Calculating area of 2D shape.");
 }

 void perimeter() {
     System.out.println("Calculating perimeter of 2D shape.");
 }
}

//hierarchical inheritance
class ThreeDimensionalShape extends Shape {
 void volume() {
     System.out.println("Calculating volume of 3D shape.");
 }

 void surfaceArea() {
     System.out.println("Calculating surface area of 3D shape.");
 }
}

//multilevel inheritance
class Circle extends TwoDimensionalShape {
 void area() {
     System.out.println("Calculating area of Circle.");
 }

 void circumference() {
     System.out.println("Calculating circumference of Circle.");
 }
}

//multilevel inheritance
class Cube extends ThreeDimensionalShape {
 void volume() {
     System.out.println("Calculating volume of Cube.");
 }

 void surfaceArea() {
     System.out.println("Calculating surface area of Cube.");
 }
}

public class HybridInheritance {
 public static void main(String[] args) {
     
     Circle circle = new Circle();
     Cube cube = new Cube();
     TwoDimensionalShape twoDShape = new TwoDimensionalShape();
     ThreeDimensionalShape threeDShape = new ThreeDimensionalShape();
     System.out.println();
     
     circle.display();
     cube.display();
     twoDShape.type();
     threeDShape.type();
     System.out.println();

     circle.area();           
     circle.circumference();  
     twoDShape.perimeter();
     System.out.println();

     cube.volume();           
     cube.surfaceArea();      
     threeDShape.surfaceArea(); 
 }
}
