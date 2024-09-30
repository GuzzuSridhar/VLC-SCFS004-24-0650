package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // create a date variable to strore current date using the LocalDate class
        LocalDate today = LocalDate.now(); // get the current system time
        System.out.println(today);

        // accessing various parameters of the data
        System.out.println(today.getYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfWeek());

        // creating a date instance to store future / historic date
        LocalDate bday = LocalDate.of(2000, 4, 25);
        System.out.println(bday);
        System.out.println(bday.getYear());
        System.out.println(bday.getDayOfMonth());
        System.out.println(bday.getMonth());
        System.out.println(bday.getDayOfWeek());
    }

}

/*
 * API class to work with date objects
 * No object of the local date class can be created ( no new keyword can be used
 * as it is a final class from API)
 */