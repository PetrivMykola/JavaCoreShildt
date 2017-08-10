package chapter7;

class Box {
    double wight;
    double height;
    double depth;

    // constructor used when all dimension specified
    Box (double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimension specifield
    Box() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        wight = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return wight * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(5);

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

    }
}
