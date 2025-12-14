package basic;

public class _10_Class {
    // A class in Java is a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from the class will have.
    // Classes help in organizing code, promoting reusability, and implementing object-oriented programming principles like encapsulation, inheritance, and polymorphism.

    // Example class representing a simple Car
    String color; // attribute
    String model; // attribute
    int year;     // attribute

    // Constructor to initialize the Car object
    public _10_Class(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        _10_Class myCar = new _10_Class("Red", "Toyota", 2020);
        
        // Calling the method to display car details
        myCar.displayDetails(); // Output: Car Model: Toyota, Color: Red, Year: 2020
    }
}
