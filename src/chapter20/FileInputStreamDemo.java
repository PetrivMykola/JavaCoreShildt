package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size = 0;

        try (
                FileInputStream f =
                        new FileInputStream("C:/ProjectProselyte/Test.txt")) {

            System.out.println("Total Avaible bytes: " + (size = f.available()));

            int n = size / 40;

            System.out.println("First " + n + "bytes for read");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("Still Avaible: " + f.available());

            System.out.println("Reading the next " + n +
                    "with one read b []");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("could not read" + n + "bytes");
            }

            System.out.println(new String(b, 0, n));
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}


