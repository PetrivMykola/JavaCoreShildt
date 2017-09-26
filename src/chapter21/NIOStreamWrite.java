package chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout =
               new BufferedOutputStream
                       (Files.newOutputStream
                               (Paths.get("file4.txt")))){

         for (int i=0; i < 26; i++)
             fout.write(('A' + i) + i);
        } catch (InvalidPathException e) {
            System.out.print(e.getMessage());
        }catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
