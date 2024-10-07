package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CloseAccount {
    static int acno;
    static boolean isInputValid;
    static Scanner scan = new Scanner(System.in);

    public static void closeAccount() {
        boolean doesAccountExist = false;
        System.out.println("Please enter an Account Number to be Closed");
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
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAcctNumber() == acno) {
                doesAccountExist = true;
                Bank temp = accounts.remove(i);
                System.out.println(
                        "Account Number "
                                + acno + " belonging to "
                                + temp.getAcctName()
                                + " has been closed and a balance of $"
                                + temp.getBalance()
                                + " refunded ");
            }
        }
        if (!doesAccountExist) {
            System.out.println("The account " + acno + " does not exist");
            closeAccount();
        }
    }

}
