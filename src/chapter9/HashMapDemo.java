package chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("jon", 2.32);
        hm.put("Vasja", 5.1235);
        hm.put("mike", 4.325);

        // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();


        // Deposit 1000 into jon account
        double balance = hm.get("jon");
        hm.put("jon", balance + 1000);

        System.out.println("jon new balance: " + hm.get("jon"));
    }
}
