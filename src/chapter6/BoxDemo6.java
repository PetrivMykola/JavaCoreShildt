package chapter6;

class Box6 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box
    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6(20, 68, 94);
        Box6 mybox2 = new Box6(2, 3, 5);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " +vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
