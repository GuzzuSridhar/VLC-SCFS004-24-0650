package stringbuilder;

public class SbDemo {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        StringBuilder location = new StringBuilder("Singapore");

        name.append("Alex");

        System.out.println(name);
        System.out.println(location);

    }
}
