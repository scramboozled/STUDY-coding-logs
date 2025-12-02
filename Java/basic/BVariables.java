package basic;
public class BVariables {

     // Variables are reusable containers for storing data values

     // Primitive data types in Java: Simple Value stored directly in the variable
     // byte, short, int, long, float, double, char, boolean

     // Reference data types in Java: memory address of the object is stored in the variable
     // Objects, Arrays, Strings

     // creating variables
     public static void main(String[] args) {

        //camelCase convention for naming variables in Java
        
        // Primitive data types
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String (Reference data type)

        // Output the values of the variables
        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);
     }
}
