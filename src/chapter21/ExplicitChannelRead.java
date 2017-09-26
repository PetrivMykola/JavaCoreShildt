package chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;
        try {
            filepath = Paths.get("file2.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }

        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            ByteBuffer mbuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mbuf);
                if (count != -1) {
                    mbuf.rewind();

                    for (int i = 0; i < count; i++)
                        System.out.print((char) mbuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("error input output " + e);
        }

    }
}
