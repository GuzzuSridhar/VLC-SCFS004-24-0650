package abstraction.interfaces;

public interface Bank {

    // static fields
    static final int archivePeriod = 48;

    float fdInterest(float depAmt, int period); // abstract method

    // add new abtract
    void newInstruction();

    // add default method ensures backward compatibility to existing implementations
    default void moreInstructions() {
    } // concrete method and can be overridden by other implementing classes

    float rdInterest(float depAmt, int period); // abstract method

    // static method which is pre defined
    static void archive() { // static method
        System.out.println("Archive all deleted records");
    }

}

/*
 * Interfaces cannot have concrete methods (Methods that have body)
 * upto Java 8 all methods in Interfaces were abstract implicitly
 * can be used to also implement mutiple inheritence
 * 
 * Interface can have (above ver 8 of java)
 * abstract
 * static (no override)
 * default
 */