package basic;
// Polymorphism: The ability of a method to take on many forms. In Java, polymorphism is mainly achieved through method overriding.
// compile-time polymorphism (method overloading): overloading methods within the same class with different parameter lists.
// runtime polymorphism (method overriding): when a subclass provides a specific implementation of a method that is already defined in its superclass.

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void start(String keyType) {
        System.out.println("Vehicle is starting with " + keyType);
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a roar");
    }
}


public class _15_Polymorphism {
  public static void main(String[] args) {
        // Compile-time polymorphism
        Vehicle myVehicle = new Vehicle();
        myVehicle.start(); // Output: Vehicle is starting
        myVehicle.start("remote key"); // Output: Vehicle is starting with remote key

        // Runtime polymorphism
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car is starting with a roar
    }
}