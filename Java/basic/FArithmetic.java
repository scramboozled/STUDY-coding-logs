package basic;

class FArithmetic {
    public static void main(String[] args) {
        // Basic arithmetic operations in Java

        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum); // Output: 15

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference); // Output: 5

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product); // Output: 50

        // Division
        int quotient = a / b;
        System.out.println("Division: " + quotient); // Output: 2

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus: " + remainder); // Output: 0

        // Increment
        a++;
        System.out.println("Incremented a: " + a); // Output: 11

        // Decrement
        b--;
        System.out.println("Decremented b: " + b); // Output: 4

        // Operator precedence
        int result = a + b * 2; // Multiplication first, then addition
        System.out.println("Operator Precedence (a + b * 2): " + result); // Output: 19

        // Using parentheses to change precedence
        result = (a + b) * 2; // Addition first, then multiplication
        System.out.println("With Parentheses ((a + b) * 2): " + result); // Output: 30

        // Precedence reference:
        // Hightest to Lowest:
        // 1. Parentheses ()
        // 2. Multiplication (*), Division (/), Modulus (%)
        // 3. Addition (+), Subtraction (-)
        // 4. Increment (++), Decrement (--)
        // Operators with the same precedence are evaluated from left to right.

        //Augmented assignment operators
        int x = 10;
        x += 5; // Equivalent to x = x + 5
        System.out.println("Augmented Assignment (x += 5): " + x); // Output: 15
        System.out.println("Augmented Assignment (x *= 2): " + (x *= 2)); // Output: 30
        System.out.println("Augmented Assignment (x -= 10): " + (x -= 10)); // Output: 20
        System.out.println("Augmented Assignment (x /= 4): " + (x /= 4)); // Output: 5
        System.out.println("Augmented Assignment (x %= 3): " + (x %= 3)); // Output: 2
        
    }
}