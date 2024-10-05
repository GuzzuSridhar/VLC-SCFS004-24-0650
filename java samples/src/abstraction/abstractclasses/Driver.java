package abstraction.abstractclasses;

public class Driver extends CitiBank {
    public static void main(String[] args) {
        CitiBank citiBank = new Driver();
        citiBank.fdInterest(100, 10);
        citiBank.rdInterest(100, 10);
        citiBank.isValid("abc100");
    }

    @Override
    double rdInterest(float amt, int period) {
        return 10;
    }
}
