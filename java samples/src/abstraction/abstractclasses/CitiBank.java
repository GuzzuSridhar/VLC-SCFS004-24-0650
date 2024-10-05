package abstraction.abstractclasses;

public class CitiBank extends Bank {

    @Override
    double fdInterest(float amt, int period) {
        return 10.99;
    }

}
