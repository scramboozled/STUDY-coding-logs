package basic;

// Dynamic Method Dispatch: When a method is called on a parent class reference that points to a child class object,
// the overridden method in the child class is executed. This is determined at runtime.
// and methods native to child class cannot be accessed using parent class reference.

class Animal {
    void voice() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    void voice() {
        System.out.println("Meow Meow");
    }

    void scratch() {
        System.out.println("Cat is scratching");
    }

public class _14_DynamicMethodDispatch {
   public static void main(String[] args) {
        Animal myAnimal = new Cat(); // Parent class reference pointing to child class object
        myAnimal.voice(); // Output: Meow Meow - overridden method in Cat class is called
        myAnimal.eat(); // Output: Animal is eating - inherited method from Animal class

        // myAnimal.scratch(); // Error: Cannot call scratch() method using Animal reference
        // downcasting to access child class specific methods
        if (myAnimal instanceof Cat) {
            Cat myCat = (Cat) myAnimal; // Downcasting
            myCat.scratch(); // Output: Cat is scratching
        }   
    }
}