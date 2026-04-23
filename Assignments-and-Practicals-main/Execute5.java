package College_Questions;

import java.util.Scanner;


class Add {
    private int num,sum;

    public Add(){
        sum = 0;
    }

    void input(int n){
        num = n;
    }

    void output(){
        int n = num;
        while(num != 0){
            sum = sum + num % 10;// add remainder to add in sum.
            num = num / 10; // assign left number to num to perform operation later.
        }
        System.out.println("The sum of " + n + " is " + sum);
    }
}

public class Execute5 {
    public static void main(String[] args) {
        Add aobj = new Add();
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number:- ");
        int n = obj.nextInt();

        aobj.input(n);

        aobj.output();



    }
}
