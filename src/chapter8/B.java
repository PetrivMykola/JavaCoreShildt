package chapter8;

public class B {
    int i;
}

class C extends B {
    int i;

    C(int a, int b) {
        super.i = a; //i in B
        i = b; // i in C
    }

    void  show() {
        System.out.println("i in superclas: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UserSuper {
    public static void main(String[] args) {

        C subOb = new C(1, 2);

        subOb.show();
    }
}
