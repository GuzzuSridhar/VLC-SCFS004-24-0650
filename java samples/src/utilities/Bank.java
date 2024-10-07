package utilities;

public interface Bank {
    boolean addAccount(String acno, String name, float initDeposit);

    boolean closeAcct(String acno);

}
