package chapter8;

class  Overld {
    int i, j;

    Overld(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i +" " + j);
    }
}
class Ovc extends Overld {
    int k;


    Ovc(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //overload show()
    void  show(String msg) {
        System.out.println(msg + k);
    }
}
public class Overload {
    public static void main(String[] args) {
        Ovc sub = new Ovc(2, 8, 965);

        sub.show("This is k: "); // this calls shows in Ovc
        sub.show(); // this calls show in Overld
    }
}