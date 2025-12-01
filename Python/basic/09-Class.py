# Classes in python are blueprints for creating objects. 
# Classes provide a means of bundling data and functionality together. 
# Creating a new class creates a new type of object, allowing new instances of that type to be made.
# Each class instance can have attributes attached to it for maintaining its state. 
# Class instances can also have methods (defined by its class) for modifying its state.

# Defining a simple class
class Dog:
    # Class attribute
    species = "Canis familiaris"

    # Initializer / Instance attributes
    def __init__(self, name, age):
        self.name = name  # instance attribute
        self.age = age    # instance attribute

    # instance method
    def bark(self):
        return f"{self.name} says Woof!"

    # instance method to get dog info
    def info(self):
        return f"{self.name} is {self.age} years old."
    

# Creating instances of the Dog class
dog1 = Dog("Buddy", 3)  
dog2 = Dog("Lucy", 5)
print(dog1.bark())  # Output: Buddy says Woof!
print(dog2.info())  # Output: Lucy is 5 years old. 5)
print(f"{dog1.name} is a {dog1.species}.")  # Output

# Accessing class attribute
print(f"{dog2.name} is a {dog2.species}.")  # Output: Lucy is a Canis familiaris.
# Modifying instance attributes
dog1.age = 4
print(dog1.info())  # Output: Buddy is 4 years old.
# Demonstrating that each instance has its own attributes
dog3 = Dog("Max", 2)
print(dog3.info())  # Output: Max is 2 years old.


# Inheritance allows new classes to inherit attributes and methods from existing classes, promoting code reuse and establishing a natural hierarchy between classes.

class Puppy(Dog):  # Inheriting from Dog class
    def __init__(self, name, age, training_level):
        super().__init__(name, age)  # Call the initializer of the parent class
        self.training_level = training_level  # New attribute for Puppy class

    def train(self):
        return f"{self.name} is at training level {self.training_level}."   
    

# Encapsulation restricts direct access to some of an object's components, which can prevent the accident
# Encapusulated data can only be accessed or modified through methods defined in the class, ensuring controlled
# Example of encapsulation
class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.__balance = balance  # Private attribute

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            return f"Deposited: {amount}. New balance: {self.__balance}"
        return "Deposit amount must be positive."

    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount
            return f"Withdrew: {amount}. New balance: {self.__balance}"
        return "Insufficient funds or invalid withdrawal amount."

    def get_balance(self):
        return f"Current balance: {self.__balance}"


# Polymorphism allows methods to do different things based on the object it is acting upon, even if they share the same name.
# This is often achieved through method overriding in derived classes.
# Example of polymorphism , this type is called method overriding
class Cat:
    def sound(self):
        return "Meow!"
class Lion:
    def sound(self):
        return "Roar!"
    
def animal_sound(animal):
    return animal.sound()       

cat1 = Cat()
lion1 = Lion()
print(animal_sound(cat1))   # Output: Meow!
print(animal_sound(lion1))  # Output: Roar!

# example of polymorphism, this type is called method overloading
class MathOperations:
    def add(self, a, b, c=0):
        return a + b + c
math_ops = MathOperations()
print(math_ops.add(2, 3))      # Output: 5
print(math_ops.add(2, 3, 4))   # Output: 9
    