import java.util.Scanner;
public class Fibonacci {
    static int fibo(int num){
        int a = 0;
        int b = 1;

        int n = 1;
        int result = 0;
        int temp = 0;

        while(n <= num){
           result = a;
           temp = a; // t = 0
           a = b; // a = 1
           b = temp + b;  // 0 + 1 = 1
           n++;
        }
       return result;
    }
    /*  0 1 1 2 3 5 8
    3
   a = 0 , b = 1 ( r = a ,t = a , a = b , b = t + a)

   n = 1 ( r = 0 , t = 0 , a = 1 , b = 0 + 1 = 1)
   n = 2 ( r = 1, t = 1 , a = 1 , b = 1 + 1 = 2)
   n = 3 ( r = 1 , t = 1 , a = 2 , b = 2 + 1 = 3)
     */

    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
        System.out.println("Enter which element to print in fibonacci series:- ");
        int num = a.nextInt();
        int result = fibo(num);
        System.out.println("The result is " + result);
    }
}
