package dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // create an object for the current time
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // access the attributes for LocalTime object
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        // create an object to store custom time
        LocalTime showTime = LocalTime.of(10, 30);
        LocalTime showTime1 = LocalTime.of(10, 30, 55);
        LocalTime showTime2 = LocalTime.of(10, 30, 55, 1000);

        // formatting the time display
        System.out.println("Local time is: " + now.format(DateTimeFormatter.ofPattern("hh:mm a")));

        // show time in a different zone
        LocalTime timeInSg = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println(timeInSg);

    }
}
