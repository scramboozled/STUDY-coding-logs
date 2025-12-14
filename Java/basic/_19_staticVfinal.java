package basic;
// static  → belongs to the class (shared by all objects).
// static class can only be inner classes and they dont require outer classes instantiation to access
class greet{
    static String greeting = "Hi";

    static void display(){
        System.out.println("Hello");
    }
}

// final   → cannot be changed (variable), overridden (method), or inherited (class).
final class greet2{
    final String greeting = "Hi";

    final void display(){
        System.out.println("Hello");
    }
}

// normal  → belongs to the object (each object has its own copy).
public class _19_staticVfinal {
    public static void main(){
        // static method and variable calling
        // does not require instantiation they dont belong to object
        System.out.println(greet.greeting);
        greet.display();

        //finals
    }
}
