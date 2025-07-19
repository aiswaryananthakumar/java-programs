package com.techitactcorejavalearning;
class Person {
    String name;
    int age;
    String city;

    // 1.Default Constructor
    Person() {
        name = "Default Name";
        age = 0;
        city = "Unknown";
        System.out.println("Default Constructor:");
    }

    // 2. No-Argument Constructor
    Person(String name, String city) {
        this.name = name;
        this.city = city;
        this.age = 0; // Default age
        System.out.println("No-Argument Constructor:");
    }

    // 3. Parameterized Constructor 
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Parameterized Constructor:");
    }
    void display() {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("City: " + city);
    }
    public static void main(String[] args) {
        //Default Constructor
        Person person1 = new Person();
        person1.display();
        //No-Argument Constructor
        Person person2 = new Person("Aiswarya", "Musiri");
        person2.display();
        //Parameterized Constructor
        Person person3 = new Person("Aish", 19, "Trichy");
        person3.display();
    }
	}