package abstraction.abstractclasses;

public class Driver {
    public static void main(String[] args) {
        CitiBank citiBank = new CitiBank();
        citiBank.fdInterest(100, 10);
        citiBank.isValid("abc100");
    }
}
