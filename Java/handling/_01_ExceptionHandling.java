package handling;
/*
 * JAVA EXCEPTION HANDLING EXAMPLE
 *
 * try     → risky code
 * catch   → handle exception
 * finally → always executes
 * throw   → manually throw exception
 * throws  → declare exception
 */

public class _01_ExceptionHandling {
    // Method declaring an exception using 'throws'
    static void divide(int a, int b) throws ArithmeticException { // throws is used to declare what type of exception a method throws

        // Manually throwing exception using 'throw'
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {

        try {
            // try → risky code
            int x = 10 / 0;   // causes ArithmeticException

            // method call that may throw exception
            divide(10, 2);

        } catch (ArithmeticException e) {
            // catch → handle exception
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            // finally → always executes
            System.out.println("Finally block executed");
        }

        // Program continues normally
        System.out.println("Program ended safely");
    }
}




/*
 * JAVA EXCEPTION HIERARCHY
 *
 * Object
 *  └── Throwable
 *       ├── Error                // Serious system errors, usually not caught
 *       │     ├── OutOfMemoryError
 *       │     ├── StackOverflowError
 *       │     └── VirtualMachineError
 *       │
 *       └── Exception            // Recoverable exceptions
 *             ├── IOException           // Input/output exceptions
 *             │     ├── FileNotFoundException
 *             │     ├── EOFException
 *             │     └── SocketException
 *             │
 *             ├── RuntimeException      // Unchecked exceptions
 *             │     ├── ArithmeticException
 *             │     ├── NullPointerException
 *             │     ├── ArrayIndexOutOfBoundsException
 *             │     ├── ClassCastException
 *             │     └── IllegalArgumentException
 *             │
 *             └── Other Exceptions
 *                   ├── SQLException
 *                   ├── ClassNotFoundException
 *                   └── InterruptedException
 *
 * Notes:
 * 1. Checked exceptions (like IOException) must be either handled or declared.
 * 2. Unchecked exceptions (RuntimeException and its subclasses) do not require mandatory handling.
 * 3. Catch specific exceptions before general ones to follow exception precedence rules.
 */

