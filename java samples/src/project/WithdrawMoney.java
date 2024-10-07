package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WithdrawMoney {
    static boolean isInputValid;
    static int acno;
    static double amtToWithdraw;
    static Scanner scan = new Scanner(System.in);

    public static void withdrawMoney() {
        boolean doesAccountExist = false;
        System.out.println("Enter the account number to withdraw from: ");
        do {
            try {
                acno = scan.nextInt();
                isInputValid = true;
            } catch (InputMismatchException ie) {
                System.out.println("Please enter a valid Account number");
                isInputValid = false;
                scan = new Scanner(System.in);
            }
        } while (isInputValid == false);  //same as !isInputValid
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAcctNumber() == acno) {
                doesAccountExist = true;
                System.out.println(
                        "The available balance in the account "
                                + acno
                                + " is: $"
                                + accounts.get(i).getBalance());
                System.out.println("Enter amount to withdraw");
                do {
                    try {
                        amtToWithdraw = scan.nextDouble();
                        isInputValid = true;
                    } catch (InputMismatchException ie) {
                        isInputValid = false;
                        System.out.println("Enter valid Amount ");
                        scan = new Scanner(System.in);
                    }
                } while (isInputValid == false);
                accounts.get(i).debit(amtToWithdraw);
                System.out.println("Transaction success....");
                System.out.println("the balance after the withdrawal is "
                        + accounts.get(i).getBalance());
            }
        }
        if (!doesAccountExist) {
            System.out.println("The account " + acno + " does not exist");
            withdrawMoney();
        }
    }

}
