package chapter8;

import java.lang.Override;

interface AAA {
    void meth1();
    void meth2();
}

interface BBB extends AAA {
    void meth3();
}

// This class must implements all of A and B

class MyClass implements BBB {

    @Override
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }

}
