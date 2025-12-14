package basic;

class EConditionals {
    // Conditional statements in Java are used to perform different actions based on different conditions.
    // The most common conditional statements are if, else if, else, and switch.

    public static void main(String[] args) {  
        //Logical OPerations
        //grateter
        // && (AND), || (OR), ! (NOT)

        // Example of if, else if, and else
        int number = 10;

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example of switch statement
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
    }