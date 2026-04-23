package College_Questions;

import java.util.Scanner;

class Factorial{
    private int i,num,fact;

    public Factorial(){
        fact = 1;
    }

    public void input(int x){
        num = x;
    }

    public void output(){
        for(i = 1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}

public class Execute2 {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);

     Factorial fobj = new Factorial();

     System.out.println("Enter number:- ");
     int x = obj.nextInt();

     fobj.input(x);

     fobj.output();


    }
}
