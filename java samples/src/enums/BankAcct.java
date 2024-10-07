package enums;

public class BankAcct {
    String acctno;
    AccountType type;

    @Override
    public String toString() {
        return "BankAcct [acctno=" + acctno + ", type=" + type + "]";
    }

    public static void main(String[] args) {
        BankAcct acct1 = new BankAcct();
        acct1.acctno = "1000";
        acct1.type = AccountType.SAVINGS;
        System.out.println(acct1);
    }
}
