package encapsulation.secure;

public class CreateAccounts {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setId(100);
        bankAccount.setBalance(2000f);
        bankAccount.setName("Alex");

        System.out.println(bankAccount.getBalance());

    }
}
