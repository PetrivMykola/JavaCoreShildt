package chapter10;

public class TrowsDemo {
    private static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne().");
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
           throwOne();
        }catch (IllegalAccessException e) {
           System.out.println("Catch exception: " + e);
        }
    }
}
