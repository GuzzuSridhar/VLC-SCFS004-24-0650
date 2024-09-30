package encapsulation;

public class CreateAccounts {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // not allowed to access the fields of bankaccount class as they are private
        // bankAccount.id = 1000;
        // bankAccount.name = "test";
        // bankAccount.balance = 1000f;

        // accessing the fields with the public methods (setter)
        bankAccount.setId(100);
        bankAccount.setName("Alex");
        bankAccount.setBalance(998.5f);

        // accessing the fields with the public methods (getter)
        System.out.println(bankAccount.getId());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getBalance());

    }
}
