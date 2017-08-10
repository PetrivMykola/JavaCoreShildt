package chapter6;

class Box3{
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        myBox1.width = 4;
        myBox1.height = 13;
        myBox1.depth = 9;

        myBox2.width = 6;
        myBox2.height = 11;
        myBox2.depth = 7;

        myBox1.volume();
        myBox2.volume();
    }
}