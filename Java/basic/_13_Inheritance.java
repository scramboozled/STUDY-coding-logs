// when constructor of paren has parameters, then child class constructor must call super(params) explicitly

package basic;

class dog {
    public dog(){
        System.out.println("Parent class constructor called");
    }

    void cuddle() {
        System.out.println("Dog is cuddling");
    }

    void voice() {
        System.out.println("Animal makes a sound");
    }
}

class GoldenRetriever extends dog {
    public GoldenRetriever(){
        System.out.println("Child class constructor called");
    }
    void voice() {
        System.out.println("Bark Bark");
    }
}   

public class _13_Inheritance {
    

    public static void main(String[] args) {

        GoldenRetriever a = new GoldenRetriever(); // both the constructors will be called, 
    // for all child classes, parent class constructor, grandparent class constructor and so on will be called first
        dog d = new dog();
        a.voice(); // Output: Bark Bark
        a.cuddle(); // Output: Dog is cuddling - method inherited from parent class
        d.voice(); // Output: Animal makes a sound
    }
}
