package chapter9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(-8);
        list.add(21);
        list.add(-20);
        list.add(8);

        // Create a reverse order comparator.
        Comparator<Integer> r = Collections.reverseOrder();

        //Sort list by using the comparator
        Collections.sort(list, r);

        System.out.print("List sorted in reverse: ");
        for (int i : list) {
            System.out.println(i + " ");
            System.out.println();
        }
            //Shuffle list.
            Collections.shuffle(list);

            //Display randomized list
            System.out.print("List shuffled: ");
            for (int a : list) {
                System.out.println(a + " ");
            }
                System.out.println();
                System.out.println("Minimum " + Collections.min(list));
                System.out.println("Minimum " + Collections.max(list));

            }

        }




