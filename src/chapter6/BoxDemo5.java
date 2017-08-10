package chapter6;
class Box5 {
    double width;
    double height;
    double depth;

    Box5() {
        System.out.println("Construction Box");
        width = 100;
        height = 100;
        depth = 100;
    }


    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
