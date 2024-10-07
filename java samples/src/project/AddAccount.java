package project;

import static project.ExecuteOption.accounts;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class AddAccount {

    static Scanner scan;
    static int acno;
    static String acname;
    static String acloc;
    static double acbal;
    static String acid;
    static boolean isValidAcctNum;
    static boolean isValidBal;

    public static void addAccount() {
        scan = new Scanner(System.in);
        System.out.println("Adding accounts");
        System.out.println("----------------------------------------");

        System.out.println("1. Enter Account number");
        do {
            try {
                acno = scan.nextInt();
                isValidAcctNum = true;
            } catch (InputMismatchException ie) {
                isValidAcctNum = false;
                System.out.println("Enter valid Account number");
                scan = new Scanner(System.in);
            }
        } while (isValidAcctNum == false);

        boolean isAcnoDuplicate = false;

        if (accounts.size() != 0) {
            do {
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAcctNumber() == acno) {
                        isAcnoDuplicate = true;
                        System.out.print("Please Enter unique Account number: ");
                        acno = scan.nextInt();
                    } else {
                        isAcnoDuplicate = false;
                    }
                }
            } while (isAcnoDuplicate); // while(iSAcnoDuplicate==true)
        }

        System.out.println("2. Enter Account Name ");
        acname = scan.next();

        System.out.println("3. enter A/c holder's location");
        acloc = scan.next();

        System.out.println("4. Enter the deposit amount");
        do {
            try {
                acbal = scan.nextDouble();
                isValidBal = true;
            } catch (InputMismatchException ie) {
                isValidBal = false;
                System.out.println("Enter valid amount");
                scan = new Scanner(System.in);
            }
        } while (isValidBal == false);

        System.out.println("5. Enter Id detail");
        acid = scan.next();
        accounts.add(new Bank(acno, acid, acname, acloc, acbal));
    }
}
