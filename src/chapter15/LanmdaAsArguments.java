package chapter15;

interface StringFunc {
    String func(String n);
}

public class LanmdaAsArguments {

    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr );

        System.out.println("The string in UpperCase " + outStr);


    }

}
