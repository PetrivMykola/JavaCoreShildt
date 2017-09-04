package chapter9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Jon", 321.254);
        tm.put("Smith", 2365.123);
        tm.put("Hall", -12.365);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + "***");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Jon");
        tm.put("Jon", balance + 1000);
        System.out.println("Jon balance: " + tm.get("Jon"));


    }
}
