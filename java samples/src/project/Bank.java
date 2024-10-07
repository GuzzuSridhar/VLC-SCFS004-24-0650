package project;

public class Bank {

    // private variables
    private int acctNumber;
    private String acctId;
    private String acctName;
    private String accLocation;
    private double balance;

    // constructor to accept account with full detail
    public Bank(int acctNumber, String acctId, String acctName, String accLocation, double balance) {
        this.acctNumber = acctNumber;
        this.acctId = acctId;
        this.acctName = acctName;
        this.accLocation = accLocation;
        this.balance = balance;
    }

    // Constructor with account number and balance
    public Bank(int acctNumber, double balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String getAcctId() {
        return acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public String getAccLocation() {
        return accLocation;
    }

    public double getBalance() {
        return balance;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public void setAccLocation(String accLocation) {
        this.accLocation = accLocation;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            balance -= amount;
        }
    }
}
