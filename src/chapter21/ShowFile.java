package chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        try (InputStream fin = Files.newInputStream(Paths.get("file1.txt"))) {

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.print(e.getMessage());
        }catch (IOException e ) {
            System.out.print(e.getMessage());
        }
    }
}
