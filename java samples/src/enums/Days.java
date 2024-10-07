package enums;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        Days day = Days.valueOf("MONDAY");
        System.out.println(day);

        int idx = Days.TUESDAY.ordinal();
        System.out.println(idx);

        for (Days d : Days.values()) {
            System.out.println(d);
        }
    }
}
