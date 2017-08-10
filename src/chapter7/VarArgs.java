package chapter7;

public class VarArgs {

    static void vaTest(int ... v) {
        System.out.print("Number of args: " + v.length + " Contens: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //Notice how an array must be created to
        //hold the arguments.
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3};
        int n3[] = { };

        vaTest(n1); // 1 arg
        vaTest(n2); // 3 arg
        vaTest(n3); // no args
    }
}
