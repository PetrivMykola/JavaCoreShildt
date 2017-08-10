package chapter8;

import java.lang.Override;

// Using run-time polymorphism.
class Fiqure {
    double dim1;
    double dim2;

    Fiqure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Fiqure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Fiqure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Fiqure f = new Fiqure(11,11);
        Rectangle r = new Rectangle(8, 4);
        Triangle t = new Triangle(9, 8);
        Fiqure  figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}
