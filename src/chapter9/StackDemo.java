package chapter9;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.println("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("stack: " + st);

        showpush(st, 45);
        showpush(st, 55);
        showpush(st, 78);



        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("stack empty");
        }
    }
}
