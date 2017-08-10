package chapter6;

class Box{
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box.
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //assign values to mybox instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth * myBox.height * myBox.width;

        System.out.println("Volume is " + vol);
        }
    }

