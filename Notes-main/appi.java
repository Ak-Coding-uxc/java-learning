package w3school;

import java.util.Scanner;
// java.util is a package name
// scanner is a class
public class appi {
    public static void main(String[] args) {
     Scanner a = new Scanner(System.in);

        System.out.print("Enter Your Name:- ");
        String name = a.nextLine();

        System.out.println("Your name is " + name);
    }
}
