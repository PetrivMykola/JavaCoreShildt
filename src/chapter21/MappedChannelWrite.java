package chapter21;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelWrite {
    public static void main(String[] args) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {
            fOut = new RandomAccessFile("file1.txt", "rw");
            fChan = fOut.getChannel();
            mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i=0; i<26;i++ )
                mBuf.put((byte) ('b' + i));

        }catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fChan != null) fChan.close();
            }catch (IOException e) {
                System.out.println("Cannot close chanel");
            }
            try {
                if (fOut != null) fOut.close();
            }catch (IOException e) {
                System.out.println("Cannot close file");
            }
        }
    }
}
