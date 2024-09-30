package encapsulation.secure;

public class BankAccount {
    private int id;
    private String name;
    private float balance = 1000f;

    private boolean isAfterHours = false;

    // public BankAccount() {
    // checktime();
    // }

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
        // imposing restriction to set the value after working hours
        if (isAfterHours)
            this.balance = balance;
        else
            System.out.println("Cannot perform this action after banking hours");
    }

    // private checkTime(){

    // }

}
