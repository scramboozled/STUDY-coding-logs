package basic;

public class _06_Loops {
    // Loops in Java are used to execute a block of code repeatedly as long as a specified condition is true.
    // Common types of loops in Java: for, while, do-while

    
    public static void main(String[] args) {
        // for loop: used when the number of iterations is known
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while loop: used when the number of iterations is not known and depends on a condition
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }


        // do-while loop: similar to while loop, but guarantees at least one execution of the loop body
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
}
