package inheritence.simple;

// use the extends keyword to have the class bne a part of the current class(parent)
public class Child extends Parent {
    String childVar;

    Child() {
        System.out.println("Child class Constructor");
    }

    void childMethod() {
        System.out.println("Child Method called");
    }

    @Override
    void eat() {
        System.out.println("eats chicken");
    }

    void occupation() {
        System.out.println("Student");
    }
}
