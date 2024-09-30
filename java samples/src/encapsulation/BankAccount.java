package encapsulation;

public class BankAccount {
    private int id;
    private String name;
    private float balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}

/*
 * POJO -- Plain Old Java Object
 * 1. All the fields are going to be private to avoid intentional or
 * unintentional access
 * 2. have public setter and getter methods to access private fields.
 * 
 */
