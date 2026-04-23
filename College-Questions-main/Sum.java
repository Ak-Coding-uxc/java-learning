package College_Questions;

import java.util.Scanner;

class SumOfNumber{
    public int sum(int n){
        int sum = 0;
        while(n != 0){
            sum = sum  + n % 10;
            n = n / 10;
        }
        return sum;
    }
}

public class Sum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number to Get Total Sum of that Number:- ");
        int num = obj.nextInt();

        SumOfNumber a = new SumOfNumber();
        int total = a.sum(num);

        System.out.println("\nThe Number is " + num + " and Reverse of that number is " + total);

    }
}

