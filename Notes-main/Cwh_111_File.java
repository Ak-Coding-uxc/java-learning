package company.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cwh_111_File {
    public static void main(String[] args)
    {
        // code to create a New file
        /*
        File myfile = new File("cwh111file.txt");// constructor ko ek path dege.
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }


        // code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
        fileWriter.write("This is our first file from java course\n okay now bye\n hello");
        fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Reading a file
        File myfile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
         */

        // deleting a file
        File myfile = new File("cwh111file.txt");
        if(myfile.delete()){
            System.out.println("I have deleted: " + myfile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
