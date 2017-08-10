package chapter7;

class StaticDemo {
    static int a = 23;
    static int b = 82;

    static void callme() {
        System.out.println("a = " + a);
    }
}
public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = "+ StaticDemo.b);
    }
}
