package chapter9;

import java.util.LinkedList;

class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;


    Adress(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> m1 = new LinkedList<>();

        m1.add(new Adress("J.W. West", "11 Oak Ave",
                "Urbana", "Il", "2365"));

        m1.add(new Adress("Ralp", "11 Maple Lane",
                "Mahomet", "IL", "6587"));

        for (Adress elem : m1) {
            System.out.println(elem + "\n");

            System.out.println();

        }

    }



}
