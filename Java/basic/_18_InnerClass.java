package basic;

// there are four types of inner classes in Java:
// 1. Nested Inner Class (non-static)
// 2. Static Nested Class
// 3. Local Inner Class (defined within a method)
// 4. Anonymous Inner Class


// in nested inner class, the inner class is defined within the body of the outer class
// it has access to all members (including private) of the outer class
// but outer class does not have access to members of inner class directly and requires an instance of inner class

class outerClass {
    private String outerField = "Outer Field";

    class InnerClass {
        public void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
    
    public void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

// Local inner Class - local to methods
// Local inner class can be only accessible to method covered it

class localInnerClassExample {
    void outerMethod() {
        // local inner class defined within a method
        class LocalInnerClass {
            void localDisplay() {
                System.out.println("Inside Local Inner Class");
            }
        }
        
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.localDisplay();
    }
}

// Anonymous Class are adhoc class created on Instantiation of a abstract classes
abstract class hello{
        abstract void display();
    }
class AnonInnerClass{
    public static void meth(){
        hello h = new hello(){
            void display(){
                System.out.println("Hi");
            }
        };

        h.display();
    }
}

// static inner class does not require an obj of outer class being created on instantiation 

class outerstaticClass {

    static class InnerstaticClass {
        public void display() {
            System.out.println("Accessing " );
        }
    }
    
    public void createInnerInstance() {
        InnerstaticClass inner = new InnerstaticClass();
        inner.display();
    }
}

public class _18_InnerClass {
    
    public static void main(String[] args) {
        
        // inner class instance requires an instance of outer class
        // accessing inner class of non static class
        outerClass.InnerClass inner =new outerClass().new InnerClass();
        inner.display();

        // inner class instance of static class
        outerstaticClass.InnerstaticClass innerstatic = new outerstaticClass.InnerstaticClass();
        innerstatic.display();
    }
}
