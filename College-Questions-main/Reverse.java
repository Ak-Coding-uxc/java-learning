package College_Questions;

import java.util.Scanner;

class ReverseOfNumber{
    public int rev(int n){
        int r= 0;
        while(n != 0){ // 76 % 10 = 6 => r * 10 + 6 = 6 ;; n = 76 / 10 = 7 ;; 60 +
            r = r * 10 + n % 10;// 67 7 + 0 * 10 = 70; 6 % 10 = 6 + 70 = 76 * 10 = 760;
            n = n / 10;// 67 = 6
        }
        return r;
    }
}// pemdas

public class Reverse {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number to Get Reverse Number of that Number:- ");
        int num = obj.nextInt();

        ReverseOfNumber a = new ReverseOfNumber();
        int rev = a.rev(num);

        System.out.println("\nThe Number is " + num + " and Reverse of that number is " + rev);

    }
}
