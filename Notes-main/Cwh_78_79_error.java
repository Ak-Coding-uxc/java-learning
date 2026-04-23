package company.com;


import java.util.Scanner;

public class Cwh_78_79_error {
    public static void main(String[] args)
    {
        // syntax error
//        int a = 5 // error no semicolon
//        int b = 6;
//        System.out.println(a);

        // logical error
        // karna kuch chate ho orr ho kuch orr rha hai
        // write a program to print all prime numbers form
        System.out.println(2);
        for(int i = 1;i<5;i++)
        {
            System.out.println(2*i+1);
        }
        // 9 also print this is runtime error.

        // Runtime error
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();// if i enter any alphabet then this is runtime error
        System.out.println("The enter number divided by 1000 is " + 1000/a);
    }
}
