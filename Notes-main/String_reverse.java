package practice;

import java.io.*;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args)
    throws IOException
    {
        /*
        ** Main point is always use IOException when using buffered class

        1 creating object of buffered class
        2. * create String name and char a
         3. input using buffered class

         4. for
         ( *{int i = last index(string obj.length() - 1)};// this give last index
          i > -1 or i >= 0;
          i-- )
          a = b.charAt(i); i = 10 , i = 9..... ( gap is also a character)// everthing written
          in ""{double quotes are string} and for char '' this.
          s.out.print(a);

          and at last try to take integer input and change also in int data type for practice.
                */

        // creating object and variables
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        char a;
        int i;

        System.out.print("Enter your name:- ");
        name = br.readLine();

        for(i = name.length() - 1; i > -1;i--){
            a = name.charAt(i);
            System.out.print(a);
        }

        System.out.println("Now taking Integer Input\n");

        int b;
        System.out.print("Enter any int value:- ");
        b = Integer.parseInt(br.readLine());// change as Int

        System.out.println("The value is " + b);
    }
}
