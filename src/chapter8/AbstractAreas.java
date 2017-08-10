package chapter8;

import java.lang.Override;

abstract class Fiqure2 {
    double dim1;
    double dim2;

    Fiqure2(double a, double b){
        dim1 = a;
        dim2 = b;
    }

   abstract double area() ;


}

class Rectangle2 extends Fiqure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
}

class Triangle2 extends Fiqure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
       // Fiqure2 f = new Fiqure2(11, 11); Illegal now
        Rectangle r = new Rectangle(8, 4);
        Triangle t = new Triangle(9, 8);
        Fiqure  figref; // this is ok, no object is created

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());


    }
}
