package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ModifyAccount {
    static boolean isInputValid;
    static int acno;
    static Scanner scan = new Scanner(System.in);

    public static void modifyAccount() {
        boolean doesAccountExist = false;
        System.out.println("Modifying Account details ");
        System.out.println("---------------------------");
        System.out.println("Enter Account number");
        do {
            try {
                acno = scan.nextInt();
                isInputValid = true;
            } catch (InputMismatchException ie) {
                System.out.println("Please enter a valid Account number");
                isInputValid = false;
                scan = new Scanner(System.in);
            }
        } while (isInputValid == false);

        System.out.println("Modifying Account details  for " + acno);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAcctNumber() == acno) {
                doesAccountExist = true;
                System.out.println("Enter Account Name");
                String acname = scan.next();
                System.out.println("Enter Account Location");
                String acloc = scan.next();
                String acid = accounts.get(i).getAcctId();
                double acbal = accounts.get(i).getBalance();
                Bank temp = new Bank(acno, acid, acname, acloc, acbal);
                accounts.set(i, temp);
                System.out.println("Details updated for account# " + acno);
            }
        }
        if (!doesAccountExist) {
            System.out.println("The account " + acno + " does not exist");
            modifyAccount();
        }
    }

}
