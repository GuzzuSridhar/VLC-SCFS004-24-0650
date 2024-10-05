package project;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner opt = new Scanner(System.in);
        System.out.println(Utils.ANSI_BLUE + "Choose from the options" + Utils.ANSI_RESET);
        System.out.println("---------------------");
        System.out.println(Utils.ANSI_GREEN + "1. Open Account");
        System.out.println("2. View Accounts");
        System.out.println("3. View Account Details");
        System.out.println("4. Perform Transaction");
        System.out.println("5. Exit" + Utils.ANSI_RESET);
        choice = opt.nextInt();
        // choice = Utils.getValidNumber("Enter your choice");
        if (choice == 1) {
            AddAccts.addAcct();
        }

        opt.close();

    }
}
