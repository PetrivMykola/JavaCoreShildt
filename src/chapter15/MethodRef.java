package chapter15;

interface StringFunc1 {
    String func1(String n);
}

class MyStringsOps {

    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length()-1; i>=0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRef {

    static String stringOp (StringFunc1 sf, String s) {
        return sf.func1(s);
    }

    public static void main(String[] args) {
        String outStr = stringOp(MyStringsOps::strReverse, "string");

    }

}

