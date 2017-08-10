package chapter8;

public class Str {
    public static void main(String[] args) {


        String a = "abcd";
        String b = "abcd";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c == d);  // False
        System.out.println(c.equals(d)); // True

        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}