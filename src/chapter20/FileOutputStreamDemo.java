package chapter20;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time all good men to come ";
        byte buf [] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

    try {
        f0 = new FileOutputStream("file1.txt");
        f1 = new FileOutputStream("file2.txt");
        f2 = new FileOutputStream("file3.txt");

    for (int i=0; i< buf.length; i +=2 ) {
        f0.write(buf[i]);
        f1.write(buf);
        f2.write(254);
    }

    } catch (IOException e ) {
        System.out.println("Error");
    }finally {
        try {
            if (f0 != null) f0.close();
        } catch (IOException e) {
            System.out.println("Error close file");
        }
        try {
            if (f1 != null) f1.close();
        } catch (IOException e) {
            System.out.println("Error close file");
        }
        try {
            if (f2 != null) f2.close();
        } catch (IOException e) {
            System.out.println("Error close file");
        }
    }
    }
}
