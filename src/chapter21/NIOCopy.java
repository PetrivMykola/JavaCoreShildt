package chapter21;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
         try {
             Path source = Paths.get("file1.txt");
             Path target = Paths.get("file4.txt");

             Files.copy(source, target);
         } catch (InvalidPathException e ) {
             System.out.println("Path invalid " + e );
         } catch (IOException e ) {
             System.out.println("Error enter " + e);
         }
    }
}
