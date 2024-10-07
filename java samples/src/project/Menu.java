package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner scan;
    //    static int opt;
        static boolean isOptValid;
    
        public static void mainMenu() {
            int opt = 0;
            try {
                scan = new Scanner(System.in);
                System.out.println("Please select from the following options");
                System.out.println("----------------------------------------");
                System.out.println("1. Add Account");
                System.out.println("2. View accounts ");
                System.out.println("3. Modify Account");
                System.out.println("4. Close Account");
                System.out.println("5. Deposit Money");
                System.out.println("6. Withdraw Money");
                System.out.println("7. View Balance");  
                System.out.println("8. Exit");
                System.out.println("Enter your choice: ");
                opt = scan.nextInt();
            } catch (InputMismatchException ie) {
                System.out.println("Enter valid option");
                mainMenu();
            }
    
            if (opt >= 1 && opt <= 9) {
                ExecuteOption.selectedOption(opt);
            } else {
                mainMenu();
            }
    
        }
    
}
