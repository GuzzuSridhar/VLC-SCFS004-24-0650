package abstraction.abstractclasses;

public abstract class Bank {
    // abstract method
    abstract double fdInterest(float amt, int period);

    // concrete method
    boolean isValid(String nric) {
        // check the nric
        return true;
    }
}
