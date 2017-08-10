package chapter8.p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public  int n_pub = 4;

    public Protection() {
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class Delivered extends Protection {
    Delivered() {
        System.out.println("delivered constructor");
        System.out.println("n = " + n);

        //class only
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n _pro = " + n_pro);
        System.out.println("n _pub = " + n_pub);
    }
}
