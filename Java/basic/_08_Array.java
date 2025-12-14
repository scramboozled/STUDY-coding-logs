package basic;

public class _08_Array {
    // Arrays in Java are used to store multiple values of the same type in a single variable.
    // unlike primitive data types, which can hold only one value at a time.
    // Arrays are objects that hold a fixed number of values of a single type.
    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = {10, 20, 30, 40, 50};
        int a[] = new int[5]; // Declaration with size

        System.out.println("Array length: " + a.length); // Output: 5

        // Accessing array elements using index
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Second element: " + numbers[1]); // Output: 20

        // Modifying an array element
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]); // Output: 35

        // Iterating through an array using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop (for-each loop) to iterate through the array
        System.out.println("Array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Multidimensional array (2D array) declaration and initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int b[][] = new int[3][3]; // Declaration of 2D array with size    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = i + j;
            }
        }
        System.out.println("2D Array b elements:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // list in python will hold different data types but in java array will hold same data type only
    }
}
