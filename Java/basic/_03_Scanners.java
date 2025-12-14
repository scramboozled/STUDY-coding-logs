package basic;

import java.util.Scanner;

class _03_Scanners {
    public static void main(String[] args) {
        // Scanner is used to get user input, and it is found in the java.util package
        // To use the Scanner class, you need to import it from the java.util package
        // import java.util.Scanner;

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input

        // Output the user input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent resource leaks
        scanner.close();

        // resource leaks means that the program is using system resources (like memory) 
        // that are not being released back to the system when they are no longer needed.

        // each datatype can be captured using different methods
        // for example, nextLine() for String, nextInt() for int, nextDouble() for double, 
        // nextBoolean() for boolean, etc.

        // reference: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html
    }
}
