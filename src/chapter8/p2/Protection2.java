package chapter8.p2;

import chapter8.p1.*;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("delivered other package constructor");

        // class or package only
        // System.out.println("n = " + n);

        //class only
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
