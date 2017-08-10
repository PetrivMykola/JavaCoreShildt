package chapter7;

class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
}

    class Overload {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            double result;

            // call all version of test
            ob.test();
            ob.test(52346);
            ob.test(2154, 3644);
        }
    }

