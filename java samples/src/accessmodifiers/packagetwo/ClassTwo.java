package accessmodifiers.packagetwo;

import accessmodifiers.packageone.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        // c1.privateField = 10; // not allowed
        // accessing the public scope valriable
        c1.publicField = 10;
        // accessing the default scope valriable
        // 1.defaultField = 10; // not allowed
    }
}
