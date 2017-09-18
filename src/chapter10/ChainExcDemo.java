package chapter10;

public class ChainExcDemo {
static void demoproc() {
    //create an exception
    NullPointerException e = new NullPointerException("top layer");

    //add a cause
    e.initCause(new ArithmeticException("cause"));

    throw e;
}

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            //display top level exc
            System.out.println("Caught: " + e);

            //display cause exc
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
