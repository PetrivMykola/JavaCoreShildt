package chapter7;

class Test4 {
    int a; // default access
    public int b; // public access
    private int c; // private access

    //methods to access c
    void setc(int i) {
        c=i;
    }
    int getc () {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        // There are ok, a and b may be accessed direcly
        ob.a = 20;
        ob.b = 53;

        // This is not OK and will cause an error
        // ob.c = 200; //Error

        // You must access c throught its methods
        ob.setc(100); // ok
        System.out.println("a, b, and c: " + ob.a + " "+ ob.b+ " " + ob.getc());


    }
}
