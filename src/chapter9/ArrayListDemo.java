package chapter9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an array list.
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Initial size of al: " +
                            a1.size());

        // Add elements to the array list.
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add(null);
        a1.add("F");
        a1.add(1, "A2");

        System.out.println("Size of a1 after addition: " +
                            a1.size());

        //Display the array list
        System.out.println("contents of a1: " + a1);

        // Remove elements from the array list
        a1.remove("D");
        a1.remove(2);

        System.out.println("Size after remove: " +
                            a1.size());
        System.out.println("Contents of a1: " + a1);
    }
}
