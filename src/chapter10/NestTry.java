package chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;

            System.out.println("a = " + a);
            try { //nested try block
                b = 2;
                int c[] = {1};
                c[42] = 99;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index of bound " +e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
