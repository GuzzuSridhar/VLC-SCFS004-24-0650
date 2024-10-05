package abstraction.abstractclasses;

public abstract class CitiBank extends Bank {

    @Override
    double fdInterest(float amt, int period) {
        return 10.99;
    }

}
