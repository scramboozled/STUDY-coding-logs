package basic;

public class _09_Method {
    // Methods in Java are blocks of code that perform a specific task.
    // They are used to organize code, promote reusability, and improve readability.

    // Method for primitive data type will create a copy of the value
    // for reference data type, it will create a copy of the reference (address in memory), so changes to the object will be reflected outside the method
    
    // static methods can be called without creating an instance of the class
    // non-static methods require an instance of the class to be called
    static void modifyPrimitive(int value) {
        value = value + 10;
        System.out.println("Inside method, modified primitive value: " + value);
    }

    static void modifyArray(int[] array) {
        array[0] = array[0] + 10;
        System.out.println("Inside method, modified array first element: " + array[0]);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before method call, num: " + num);
        modifyPrimitive(num);
        System.out.println("After method call, num: " + num); // num remains unchanged

        int[] arr = {1, 2, 3};
        System.out.println("Before method call, arr[0]: " + arr[0]);
        modifyArray(arr);
        System.out.println("After method call, arr[0]: " + arr[0]); // arr[0] is modified
    }
}
