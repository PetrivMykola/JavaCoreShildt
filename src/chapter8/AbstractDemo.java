package chapter8;

import java.lang.Override;

abstract class AA {
    abstract void callme();

    // concrete methods are sill allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class BB extends AA{
    @Override
    void callme() {
        System.out.println("BB implementation callme.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        BB b = new BB();

        b.callme();
        b.callmetoo();
    }
}
