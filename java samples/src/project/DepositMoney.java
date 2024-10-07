package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DepositMoney {
    static int acno;
    static double deposit;
    static boolean isInputValid;
    static Scanner scan = new Scanner(System.in);

    public static void depositMoney() {
        boolean doesAccountExist = false;
        System.out.println("Enter the account number to deposit money into ");
        do {
            try {
                acno = scan.nextInt();
                isInputValid = true;
            } catch (InputMismatchException ie) {
                isInputValid = false;
                System.out.println("Enter valid Account number");
                scan = new Scanner(System.in);
            }
        } while (isInputValid == false);

        for (int i = 0; i < accounts.size(); i++) {
            isInputValid = false;
            if (accounts.get(i).getAcctNumber() == acno) {
                doesAccountExist = true;
                System.out.println("Enter the amount to be deposited: ");
                do {
                    try {
                        deposit = scan.nextDouble();
                        isInputValid = true;
                    } catch (InputMismatchException ie) {
                        isInputValid = false;
                        System.out.println("Enter valid Amount ");
                        scan = new Scanner(System.in);
                    }
                } while (isInputValid == false);
                accounts.get(i).credit(deposit);
                System.out.println("The balance in the account "
                        + acno
                        + " after deposit is $"
                        + accounts.get(i).getBalance());
            }
        }
        if (!doesAccountExist) {
            System.out.println("The account " + acno + " does not exist");
            depositMoney();
        }
    }

}
