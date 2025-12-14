package basic;
// Abstraction is one of the four fundamental OOP concepts
// Abstract classes cannot be instantiated directly
// They can contain abstract methods (without implementation) and concrete methods (with implementation)
// Abstract classes are meant to be subclassed, and the subclasses provide implementations for the abstract methods

// usage: abstract classes are generally used when you want to provide a common base class 
// with some shared code and enforce certain methods to be implemented by subclasses

// reference can be created for abstract classes but objects cannot be instantiated
abstract class Animal {
    // abstract method (does not have a body)
    public abstract void makeSound();
    
    // concrete method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    // providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof");
    }
}


public class _16_Abstraction {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // This would be an error: cannot instantiate abstract class

        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Woof
        dog.sleep();     // Outputs: Zzz...
    }
}
