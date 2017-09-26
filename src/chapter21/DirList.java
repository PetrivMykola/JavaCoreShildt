package chapter21;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";

        try (DirectoryStream<Path> dirstr = Files.newDirectoryStream(Paths.get(dirname))){

            for (Path entry : dirstr) {

                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.println("<Dir> ");
                else
                    System.out.println(entry.getName(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
