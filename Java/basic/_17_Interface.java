package basic;

// Interface is one of the four fundamental OOP concepts
// An interface is a reference type in Java, similar to a class, that can contain only
// constants, method signatures, default methods, static methods, and nested types
// Interfaces cannot contain instance fields or constructors
// usage: interfaces are generally used to define a contract that implementing classes must follow
// example: callbacks or defining capabilities that can be shared across different classes

interface Vehicle {
    // all methods in an interface are implicitly public and abstract
    void start();
    void stop();
    
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class _17_Interface {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Outputs: Car started
        myCar.stop();  // Outputs: Car stopped
    }
}
