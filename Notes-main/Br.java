package practice;

import java.io.*;

public class Br {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        // System.in bytes mein input lega.
        // InputStreamReader usko character mein convert karega.
        // Buffered Reader fast input lene ke liye use hota hai.
        // .readLine() = full line read // .read() character read karta hai.

        System.out.println("Enter line:- ");
        String a = obj.readLine();// read full line

        System.out.println("Enter word:- ");
        char b = (char)obj.read();// read single word

        System.out.println(a);
        System.out.println(b);

    }
}
