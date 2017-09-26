package chapter21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelWriteBefore7 {
    public static void main(String[] args) {

        FileOutputStream fout = null;
        FileChannel fchan = null;
        ByteBuffer mbuf;

        try {
            fout = new FileOutputStream("file1.txt");

            fchan= fout.getChannel();

            mbuf = ByteBuffer.allocate(26);

            for (int i=0; i<26;i++ )
                mbuf.put((byte) ('b' + i));

            mbuf.rewind();

            fchan.write(mbuf);

        }catch (IOException e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            if (fchan != null) fchan.close();
        }catch (IOException e) {
            System.out.println("Cannot close chanel");
        }
        try {
            if (fout != null) fout.close();
        }catch (IOException e) {
            System.out.println("Cannot close file");
        }
    }
}
}
