package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(6);
        myList.add(84);
        myList.add(3);
        myList.add(21);
        myList.add(45);

        System.out.println("Original list: " + myList);

        Stream <Integer> myStream = myList.stream();

        Optional<Integer> minval = myStream.min(Integer::compare);
        if (minval.isPresent()) System.out.println("Minimum " + minval.get());

        myStream = myList.stream();

        Optional<Integer> maxval = myStream.max(Integer::compare);
        if (maxval.isPresent()) System.out.println("Maximum " + maxval.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach(n -> System.out.print(n + " ") );



    }
}
