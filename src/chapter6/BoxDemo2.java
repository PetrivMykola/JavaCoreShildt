package chapter6;

class Box2{
    double width;
    double height;
    double depth;
}
public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 3;
        myBox1.height = 12;
        myBox1.depth = 8;

        myBox2.width = 5;
        myBox2.height = 10;
        myBox2.depth = 6;

        // compute volume of first box
        vol = myBox1.depth * myBox1.width * myBox1.depth;
        System.out.println("Volume is " + vol);

        // compute volume of second box
        vol = myBox2.depth * myBox2.width * myBox2.depth;
        System.out.println("Volume is " + vol);
    }

}
