package chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {

    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(4.0);
        myList.add(78.0);
        myList.add(12.0);
        myList.add(12.1);
        myList.add(7.1);

        Stream<Double> sqrtRootStrm =
                myList.stream()
                .map(a -> Math.sqrt(a));
        System.out.println(myList);
        System.out.println(sqrtRootStrm.toString());


    }
}
