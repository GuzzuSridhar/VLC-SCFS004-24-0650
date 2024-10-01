package project;

import java.util.Scanner;

public class Menu {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte choice;
        Scanner opt = new Scanner(System.in);
        System.out.println(Utils.ANSI_BLUE + "Choose from the options" + Utils.ANSI_RESET);
        System.out.println("---------------------");
        System.out.println(Utils.ANSI_GREEN + "1. Open Account");
        System.out.println("2. View Accounts");
        System.out.println("3. View Account Details");
        System.out.println("4. Perform Transaction");
        System.out.println("5. Exit" + Utils.ANSI_RESET);
        choice = opt.nextByte();
        if (choice == 1) {
            AddAccts.addAcct();
        }

        opt.close();

    }
}
