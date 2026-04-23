package practice_exam;

import java.io.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        /*
           File myFile = new File("Hello.txt");
           try{
               myFile.createNewFile();
           }catch(Exception e){
               System.out.println("The error is :- " + e);
           }
           */

/*
        try {
            FileWriter myWriter = new FileWriter("Hello.file");
            myWriter.write("hello my nae is ");
            myWriter.close();
        }catch(Exception e){
            System.out.println("The error is " + e);
        }


*/


        try{
            File myFile = new File("Hello.file");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("The error is " + e);
        }

    }
}
