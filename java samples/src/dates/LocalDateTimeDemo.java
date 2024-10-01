package dates;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // current date and time
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // custom date and time
        LocalDateTime bday = LocalDateTime.of(2000, 3, 23, 10, 10);
        System.out.println(bday);
    }
}
