package chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(8, 5, 1, 0.32);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight is " + weightbox.weight);
        System.out.println();

        //assign BoxWeight reference to Box reference
        plainbox = weightbox;

        vol = plainbox.volume(); //Ok, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);

    }
}
