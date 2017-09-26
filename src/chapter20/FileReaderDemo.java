package chapter20;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/ProjectProselyte/Test.txt"))
        {
            int c;

            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Error open file " + e);
        }
    }
}
