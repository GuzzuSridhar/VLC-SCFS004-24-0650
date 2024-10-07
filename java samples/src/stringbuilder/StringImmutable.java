package stringbuilder;

public class StringImmutable {
    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(test.hashCode());
        test += " World";
        System.out.println(test.hashCode());

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode());
        sb.append(" World");
        System.out.println(sb.hashCode());

        System.out.println(sb);
        System.out.println(sb.reverse());

    }
}
