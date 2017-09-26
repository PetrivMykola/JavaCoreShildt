package chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("imposible to open file");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.print("Error Reading File");
        }

        // Close the file
        try {
            fin.close();
        } catch (IOException e) {
            System.out.print("Error closing File");
        }
    }
}
