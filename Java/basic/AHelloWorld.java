package basic;

class HelloWorld {
    // This is a single-line comment
    /*
     This is a multi-line comment
     It can span multiple lines
    */

     // The Class name must match the file name if it's public
     // The main method is the entry point of any Java application
     // Don't follow the convention used here, it's just for demonstration and ordering the files
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // Javac is the Java compiler that converts Java source code into bytecode
    // syntax: javac HelloWorld.java from project root directory
    // run: java basic.HelloWorld from project root directory
    // basic is the package name/namespace
}