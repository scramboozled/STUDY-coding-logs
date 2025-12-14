package basic;
class _02_Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        // concatenation
        String fullName = "John" + " " + "Doe";
        System.out.println("Full Name: " + fullName);

        //println will typecast non-string types to string automatically dont need to do it manually
        int age = 30;
        System.out.println("Age: " + age);

        // String methods
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Uppercase str3: " + str3.toUpperCase());
        System.out.println("Substring of str3 (7-12): " + str3.substring(7, 12));
        System.out.println("Index of 'World' in str3: " + str3.indexOf("World"));
        System.out.println("Replace 'World' with 'Java': " + str3.replace("World", "Java"));

        //indexing
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Character at index 4 in str2: " + str2.charAt(4));

        // Slice equivalent
        System.out.println("Slice str3 from index 0 to 5: " + str3.substring(0, 5));

        // Escape sequences
        // These are used to encode special characters in a string
        // typical (") is considered as end of string so to include it we use escape sequence (\")
        // other escape sequences: \n (new line), \t (tab), \\ (backslash)
        String strWithQuotes = "He said, \"Hello!\"";
        System.out.println(strWithQuotes);
        
    }
}
