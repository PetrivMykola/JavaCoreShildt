package chapter8;
 class  Ov {
     int i, j;

     Ov(int a, int b) {
         i = a;
         j = b;
     }

     void show() {
         System.out.println("i and j: " + i +" " + j);
     }
 }
class Ovb extends Ov {
     int k;


    Ovb(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //display k - this overrides show in Ov
    void  show() {
        System.out.println("k: " + k);
    }
}
public class Override {
    public static void main(String[] args) {
        Ovb sub = new Ovb(2, 8, 965);

        sub.show(); // this calls show() inOvb
    }
}
