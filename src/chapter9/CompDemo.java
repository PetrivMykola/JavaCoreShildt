package chapter9;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String aStr, bStr;
        aStr = o1;
        bStr = o2;
        return bStr.compareTo(aStr);
    }
}
public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("E");
        ts.add("B");

        for (String elem : ts) {
            System.out.print(elem + " ");
            System.out.println();
        }

    }
}
