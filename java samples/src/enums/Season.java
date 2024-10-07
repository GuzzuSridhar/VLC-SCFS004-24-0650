package enums;

public enum Season {
    WINTER("Cold"),
    SUMMER("HOT"),
    Spring("Warm");

    String desc;

    Season(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        Season season = Season.valueOf("SUMMER");
        System.out.println(season);

        Season sea = Season.Spring;
        System.out.println("Season: " + sea);
        System.out.println("Description: " + sea.desc);

    }
}
