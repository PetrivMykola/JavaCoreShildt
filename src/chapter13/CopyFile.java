package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("C:/ProjectProselyte/Test.txt");
            fout = new FileOutputStream("C:/ProjectProselyte/Test1.txt");

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.print("Error"+ e.getMessage());
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.print("Error close fin file");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.print("Error close fout file");
            }
        }
    }
}
