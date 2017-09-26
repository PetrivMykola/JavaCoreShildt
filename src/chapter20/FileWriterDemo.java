package chapter20;

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("C:/ProjectProselyte/Test.txt");
             FileWriter f1 = new FileWriter("C:/ProjectProselyte/Test1.txt");
             FileWriter f2 = new FileWriter("C:/ProjectProselyte/Test2.txt") ) {
            for (int i=0; i<buffer.length; i+=2) {
                f0.write(buffer[i]);
            }

            f1.write(buffer);

            f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
        } catch (IOException e) {
                 System.out.println("Error " + e );
        }
    }
}
