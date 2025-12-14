package basic;
public class _12_encapusulation {
    private String name; // private variable, cannot be accessed directly from outside the class
    public String age; // public variable, can be accessed from outside the class
    protected String address; // protected variable, can be accessed within the same package and subclasses

    // public setter method for name - allows controlled access to the private variable
    public void setName(String name) {
        this.name = name;
    }
    // public getter method for name - allows controlled access to the private variable
    public String getName() {
        return name;
    }


}
