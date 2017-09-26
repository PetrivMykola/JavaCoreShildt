package chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("C:/ProjectProselyte/Test.txt");

        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent : " + f1.getParent());
        p(f1.exists() ? "exist" : "Does not exist");
        p(f1.canWrite() ? "read" : "Does not read");
        p(f1.canRead() ? "write" : "Does not write");


    }
}
