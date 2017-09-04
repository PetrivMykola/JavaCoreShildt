package chapter9;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));
        if (k==0)
            return o1.compareTo(o2);
        else
            return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm =
                new TreeMap<>(new TComp());

        tm.put("John Doe", 3434.12);
        tm.put("Tom Smith", 125.32);
        tm.put("Tod Hall", 88.125);
        tm.put("Jane Smith", -258.321);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + "***");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("Jon", balance + 1000);
        System.out.println("Jon balance: " + tm.get("John Doe"));
    }
}
