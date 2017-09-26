package chapter13;

import chapter8.Str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {

        // create BufferReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'quit' to quit.");
        do {
            str = br.readLine();
            System.out.print(str);
        } while (!str.equals("stop"));
    }
}
