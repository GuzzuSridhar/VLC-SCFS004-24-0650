package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ViewBalance {
    static boolean isInputValid;
    static int acno;
    static Scanner scan = new Scanner(System.in);

    public static void viewBalance() {
        boolean doesAccountExist = false;
        System.out.println("Enter the account number to to view balance ");
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
                System.out.println("The balance in the account "
                        + acno
                        + " is $"
                        + accounts.get(i).getBalance()
                );
            }
        }
        if (!doesAccountExist) {
            System.out.println("The account " + acno + " does not exist");
            viewBalance();
        }
    }

}
