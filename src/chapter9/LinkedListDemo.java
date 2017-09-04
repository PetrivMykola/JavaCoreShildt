package chapter9;

import chapter8.Str;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("F");
        list.add("B");
        list.add("D");
        list.add("V");
        list.add("M");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");

        System.out.println("Original contents of list: " + list);

        // Remove
        list.remove("F");
        list.remove(2);

        System.out.println("Contents of list after deletion: " + list);

        list.removeLast();
        list.removeFirst();

        System.out.println("Contents of list after deletion first and last: " + list);

        // Get and set a value

        String val = list.get(3);
        list.set(2, val + "Changed");

        System.out.println("list after change: " + list);
    }


}
