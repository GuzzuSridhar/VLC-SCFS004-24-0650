package abstraction.interfaces;

public class MayBank implements Bank {

    @Override
    public float fdInterest(float depAmt, int period) {
        float roi = 2.8f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    @Override
    public float rdInterest(float depAmt, int period) {
        float roi = 3.0f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

}
