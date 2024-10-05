package abstraction.interfaces;

public class CitiBank implements Bank {

    @Override
    public float fdInterest(float depAmt, int period) {
        float roi = 1.8f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    @Override
    public float rdInterest(float depAmt, int period) {
        float roi = 3.8f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

}
