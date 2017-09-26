package chapter15;

@FunctionalInterface
interface MyNumber {
    double getValue ();
}

public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber myNum;

        myNum = () -> 123.3542;

        System.out.println("Value :" + myNum.getValue());

        myNum = () -> Math.random() *100;

        System.out.println("Random value: " + myNum.getValue());

    }




}
