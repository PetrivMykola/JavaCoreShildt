package chapter9;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Opympia");

        //Get a set-view of the keys

        Set<?> states = capitals.keySet();

        //Show all of the states and capitals
        for (Object name : states) {
            System.out.println("The capital of " +  name + "is " + capitals.getProperty((String)name) + " ");

        }

        System.out.println();

        String str = capitals.getProperty("Washington");
        System.out.println("The capital of Washington is " + str + ".");


    }
}
