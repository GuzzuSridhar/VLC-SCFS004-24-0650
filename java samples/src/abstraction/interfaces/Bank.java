package abstraction.interfaces;

public interface Bank {
    float fdInterest(float depAmt, int period); // abstract method

    float rdInterest(float depAmt, int period); // abstract method
}

/*
 * Interfaces cannot have concrete methods (Methods that have body)
 * upto Java 8 all methods in Interfaces were abstract implicitly
 * can be used to also implement mutiple inheritence
 */