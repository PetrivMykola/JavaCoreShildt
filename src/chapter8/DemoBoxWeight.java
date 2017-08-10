package chapter8;
class BoxX {
    double width;
    double height;
    double depth;

    //construct clone of an object
    BoxX(BoxX ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // This is the constructor for Box
    BoxX(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxX() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxX(double len) {

        width = height = depth = len;
    }

    double volume() {

        return width * height * depth;
    }
}

// Here, Box is extended to include weight
class BoxWeightX extends BoxX {
    double weight;

    BoxWeightX(double w, double h, double d, double m) {
        weight = w;
        height = h;
        depth = d;
        width = m;
    }

}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeightX mybox1 = new BoxWeightX(20, 68, 94, 12);
        BoxWeightX mybox2 = new BoxWeightX(2, 3, 5, 86);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox1.weight);
        System.out.println();;
    }
}


