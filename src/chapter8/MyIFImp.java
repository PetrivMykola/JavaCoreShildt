package chapter8;

import java.lang.Override;

public class MyIFImp implements MyIF {
    @Override
    public int getNumber() {
        return 0;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp ob = new MyIFImp();

        System.out.println(ob.getNumber());

        System.out.println(ob.getString());
    }
}

