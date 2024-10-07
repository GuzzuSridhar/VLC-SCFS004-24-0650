package utilities;

import java.time.LocalDateTime;

public class BankAccount {
    int acctId;
    float bal;
    LocalDateTime createDate;

    public BankAccount(int acctId, float bal, LocalDateTime createDate) {
        this.acctId = acctId;
        this.bal = bal;
        this.createDate = createDate;
    }

    // @SuppressWarnings("unused")
    // public static void main(String[] args) {
    // BankAccount acct1 = new BankAccount(100, 99f, LocalDateTime.now());
    // }
}
