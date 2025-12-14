package basic;

public class _07_defaultvalues {
    // In Java, default values are assigned to variables when they are declared but not explicitly initialized.
    // Default values depend on the data type of the variable.
    static int defaultInt;               // Default value is 0
    static double defaultDouble;         // Default value is 0.0
    static boolean defaultBoolean;       // Default value is false
    static char defaultChar;             // Default value is '\u0000' (null character)
    static String defaultString;         // Default value is null
    static Object defaultObject;         // Default value is null
    public static void main(String[] args) {
        System.out.println("Default int value: " + defaultInt);
        System.out.println("Default double value: " + defaultDouble);
        System.out.println("Default boolean value: " + defaultBoolean);
        System.out.println("Default char value: '" + defaultChar + "'");
        System.out.println("Default String value: " + defaultString);
        System.out.println("Default Object value: " + defaultObject);
    }
    
}
