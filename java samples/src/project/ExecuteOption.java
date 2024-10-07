package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecuteOption {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Bank> accounts = new ArrayList<>();

    public static void selectedOption(int i) {
        switch (i) {
            case 1:
                AddAccount.addAccount();
                Menu.mainMenu();
            case 2:
                ViewAccounts.viewAccounts();
                Menu.mainMenu();
            case 3:
                ModifyAccount.modifyAccount();
                Menu.mainMenu();
            case 4:
                CloseAccount.closeAccount();
                Menu.mainMenu();
            case 5:
                DepositMoney.depositMoney();
                Menu.mainMenu();
            case 6:
                WithdrawMoney.withdrawMoney();
                Menu.mainMenu();
            case 7:
                ViewBalance.viewBalance();
                Menu.mainMenu();
            case 8:
                System.exit(0);
            case 9:
                PopulateDummyData.fillDummyData();
                System.out.println("Dummy data filled");
                Menu.mainMenu();
        }
    }
}
