package chapter9;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<>();

        // Add elements
        hs.add(null);
        hs.add(null);
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");

        System.out.println(hs);
    }
}
