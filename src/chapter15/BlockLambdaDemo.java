package chapter15;

interface NumericFunc {
    int func (int n);
}

public class BlockLambdaDemo {

    public static void main(String[] args) {

        NumericFunc factorial = n -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("Factorial 3 = "  + factorial.func(3) );
    }
}

