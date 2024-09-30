package accessmodifiers.packagetwo;

public class ClassOne {
    public static void main(String[] args) {
        accessmodifiers.packageone.ClassOne c1 = new accessmodifiers.packageone.ClassOne();

        // demo access Modifiers outside the package (World)

        // accessing the private scope valriable
        // c1.privateField = 10; // not allowed
        // accessing the public scope valriable
        c1.publicField = 10;
        // accessing the default scope valriable
        // c1.defaultField = 10; // not allowed
    }
}
