package chapter8.p3;

class A {

    // this is a nested interface
    public interface NestedIF {
       boolean isNotNegative(int x);
    }
}

    // B implements the nested interface
class B implements A.NestedIF {
        @Override
        public boolean isNotNegative(int x) {
            return x < 0 ? false: true;
        }
    }

public class NestedIfDemo {
    public static void main(String[] args) {

        // use a nested interface reference
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("this wii not be displayed");
    }
}
