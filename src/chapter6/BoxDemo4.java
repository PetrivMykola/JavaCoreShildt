package chapter6;
class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        mybox1.width = 23;
        mybox1.height = 45;
        mybox1.depth = 78;

        mybox2.width = 42;
        mybox2.height = 30;
        mybox2.depth = 12;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
