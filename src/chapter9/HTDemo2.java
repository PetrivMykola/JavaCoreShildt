package chapter9;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John", 321.125);
        balance.put("Tom", 123.123);
        balance.put("Tod", 99.21);

        Set<String> set = balance.keySet();

        Iterator<String> itr = set.iterator();


        while(itr.hasNext()){
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        //Deposit 1.000 into John
        bal = balance.get("John");
        balance.put("John", bal + 1000);
        System.out.println("john balance: "+ balance.get("John"));
    }
}