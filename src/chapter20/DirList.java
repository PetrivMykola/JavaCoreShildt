package chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File f = new File(dirname);
        if (f.isDirectory()) {
            System.out.println("Directory of" + dirname);
            String s[] = f.list();

            for (int i=0; i<s.length; i++) {
                File f2 = new File(dirname + "/" + s[i]);
                if (f2.isDirectory()) {
                    System.out.println(s[i] + "is Directry");
                } else {
                    System.out.println(s[i] + "is File");
                }
            }
        } else {
            System.out.println(dirname + "is not a directory" );
        }
    }
}
