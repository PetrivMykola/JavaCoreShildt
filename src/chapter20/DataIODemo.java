package chapter20;

import java.io.*;

public class DataIODemo {

    public static void main(String[] args) {

        // First write data.
        try (DataOutputStream dout =
                     new DataOutputStream(new FileOutputStream("C:/ProjectProselyte/Test.txt")) ){
            dout.writeDouble(98.365);
            dout.writeInt(20000);
            dout.writeBoolean(true);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        // Now read the data back.

        try (DataInputStream din = new DataInputStream(new FileInputStream("C:/ProjectProselyte/Test.txt")))
        {

            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " +
                    d + " " + i + " " + b);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
