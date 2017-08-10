package chapter7;

class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) return  1;
        else result = fact(n-1) * n;
        return  result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial of 8 is " + f.fact(8));
        System.out.println("Factorial of 9 is " + f.fact(9));
        System.out.println("Factorial of 10 is " + f.fact(10));
    }
}
