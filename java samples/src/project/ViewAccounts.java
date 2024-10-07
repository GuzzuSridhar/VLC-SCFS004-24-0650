package project;

import static project.ExecuteOption.accounts;

public class ViewAccounts {
    public static void viewAccounts() {
        System.out.println("Displaying all Accounts");
        System.out.println("---------------------------------------------------");
        if (!accounts.isEmpty()) {
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println("The details of account "
                        + " " + accounts.get(i).getAcctNumber()
                        + " are ");
                System.out.println("     Account Name: " + accounts.get(i).getAcctName());
                System.out.println("     Account Balance: " + accounts.get(i).getBalance());
                System.out.println("---------------------------------------------------");
            }
        } else {
            System.out.println("Please add accounts");
        }
    }

}
