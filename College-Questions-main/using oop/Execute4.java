package College_Questions;

import java.util.Scanner;

class Reverse{
    private int num , rev;

    public Reverse(){
        rev = 0;
    }

    void input(int x){
    num = x;
    }

    void output(){
        int n = num;
        while(num != 0){
            rev =   rev * 10  + num % 10; // because to get last digit.(%)
            num = num / 10; // because to get 1st digit(*)
        }
        System.out.println("The reverse of " + n + " is " + rev);
    }
}

public class Execute4 {
    public static void main(String[] args) {

    Reverse r = new Reverse();

    Scanner obj = new Scanner(System.in);

    System.out.print("Enter number :- ");
    int x = obj.nextInt();

    r.input(x);

    r.output();

    }
}
