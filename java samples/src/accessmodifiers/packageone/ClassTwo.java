package accessmodifiers.packageone;

public class ClassTwo {
    // instance variables
    @SuppressWarnings("unused")
    private int privateField; // private access modifier
    public int publicField; // public access modifier
    int defaultField; // defaulr access modifier (No keyword)

    // demonstrate the access modifiers
    // Accessing the instance variables in the same class
    public static void main(String[] args) {
        ClassTwo c2 = new ClassTwo();
        // accessing the private scope valriable
        c2.privateField = 10;
        // accessing the public scope valriable
        c2.publicField = 10;
        // accessing the default scope valriable
        c2.defaultField = 10;

        // Accessing the instance variables from other class
        ClassOne c1 = new ClassOne();
        // accessing the private scope valriable
        // c1.privateField = 10; // not allowed (compile time error)
        // accessing the public scope valriable
        c1.publicField = 10;
        // accessing the default scope valriable
        c1.defaultField = 10;
    }

}
