package project;

import static project.ExecuteOption.accounts;

public class PopulateDummyData {
    static void fillDummyData(){
        accounts.add(new Bank(101, "MB101", "John", "SG", 500));
        accounts.add(new Bank(102, "MB102", "Jim", "SG", 500));
        accounts.add(new Bank(103, "MB103", "Jack", "SG", 500));
        accounts.add(new Bank(104, "MB104", "Alex", "SG", 500));
        accounts.add(new Bank(105, "MB105", "Bill", "SG", 500));
        accounts.add(new Bank(106, "MB106", "Roy", "SG", 500));
    }
}
