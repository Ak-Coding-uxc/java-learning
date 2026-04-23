package College_Questions;

import java.util.Scanner;

class Fibonacci{
    private int temp,a,b,num,i;

    public Fibonacci()
    {
        a = 0;
        b = 1;
        i =1;
        temp = 0;
    }

    public void input(int x){
        num = x;
    }

    public void output(){
        System.out.println("The first " + num + " number of fibonacci series are:- ");
        while(i <= num){
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
            i++;
        }
    }
}

public class Execute1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Fibonacci fibobj = new Fibonacci();

        System.out.print("Enter how many numbers in fibonacci series user want to print:- ");
        int x = obj.nextInt();

        fibobj.input(x);

        fibobj.output();
    }
}
