package accessmodifiers.packageone;

public class ClassOne {

    // instance variables
    @SuppressWarnings("unused")
    private int privateField; // private access modifier
    public int publicField; // public access modifier
    int defaultField; // defaulr access modifier (No keyword)

    // private method
    private void privateMethod() {
        System.out.println("Private method of package one and class one");
    }

    // public method
    public void publicMethod() {
        System.out.println("public method of package one and class one");
    }

    // default method
    void defaultMethod() {
        System.out.println("default method of package one and class one");
    }

    // demonstrate the access modifiers
    // Accessing the instance variables in the same class
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        // accessing the private scope valriable
        c1.privateField = 10;
        // accessing the public scope valriable
        c1.publicField = 10;
        // accessing the default scope valriable
        c1.defaultField = 10;

        // accessing private method
        c1.privateMethod();
        // accessing public method
        c1.publicMethod();
        // accessing default scope method
        c1.defaultMethod();

    }

}
