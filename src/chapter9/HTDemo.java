package chapter9;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John", 321.125);
        balance.put("Tom", 123.123);
        balance.put("Tod", 99.21);

        //Show all balances in hashtable.
        names = balance.keys();
        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        //Deposit 1.000 into John
        bal = balance.get("John");
        balance.put("John", bal + 1000);
        System.out.println("john balance: "+ balance.get("John"));
    }
}
