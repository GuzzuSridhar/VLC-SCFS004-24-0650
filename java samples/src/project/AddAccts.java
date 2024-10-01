package project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddAccts {
    public static ArrayList<BankAccount> accts = new ArrayList<>();

    static boolean addAcct() {
        int x = 0;
        float b = 0f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Acct Number: ");
        x = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Acct Balance: ");
        b = scan.nextFloat();
        scan.nextLine();

        scan.close();

        BankAccount newAcct = new BankAccount(x, b, LocalDateTime.now());
        accts.add(newAcct);
        return true;
    }
}
