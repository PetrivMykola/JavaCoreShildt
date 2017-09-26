package chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelReadBefore7 {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileChannel fchan = null;
        ByteBuffer mbuf = null;
        int count;

        try {
            fin = new FileInputStream("file1.txt");
            fchan = fin.getChannel();
            mbuf = ByteBuffer.allocate(128);

            do {
                count = fchan.read(mbuf);
                if (count != -1) {
                    mbuf.rewind();

                    for (int i=0; i<count; i++)
                        System.out.print((char)mbuf.get());
                }
            }while (count != -1);

            System.out.println();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fchan != null) fchan.close();
            }catch (IOException e) {
                System.out.println("Cannot close chanel");
            }
            try {
                if (fchan != null) fin.close();
            }catch (IOException e) {
                System.out.println("Cannot close file");
            }
            }
        }
    }

