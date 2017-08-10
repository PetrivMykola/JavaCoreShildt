package chapter8.Stack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(25);
        FixedStack mystack2 = new FixedStack(11);

        // push some numbers off the stack
        for (int i=0; i<25; i++) mystack1.push(i);
        for (int i=0; i<11; i++) mystack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack in mystack1: ");
        for (int i=0; i<25; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for (int i=0; i<11; i++)
            System.out.println(mystack2.pop());
    }
}
