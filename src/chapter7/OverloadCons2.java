package chapter7;
class Box2 {
    double wight;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box2.
    Box2(Box2 ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimension specified
    Box2 (double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimension specifield
    Box2() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box2(double len) {
        wight = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return wight * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(5);

        Box2 myclone = new Box2(mybox1);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is "+ vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is "+ vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }

    }



