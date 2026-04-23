package College_Questions;
import java.util.Scanner;

public class BiggestFrom3 {
    public void output(int a,int b,int c){
        if(a > b && a > c){
            System.out.println("The biggest number is a = " + a );
        }

        else if(b > a && b > c){
            System.out.println("The biggest number is b = " + b );
        }

        else if (c > a && c > b){
            System.out.println("The biggest number is c = " + c);
        }

        else{
            System.out.println("Equal");
        }
    }
    /*
     k = 0
     (k < a) = k = a
     (k < b) = k = b
     (k < c_ = k = c
     if( a== b == c)
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a ,b, c;

        System.out.print("Enter value of a:- ");
        a = sc.nextInt();

        System.out.print("Enter value of b:- ");
        b = sc.nextInt();

        System.out.print("Enter value of b:- ");
        c = sc.nextInt();

        BiggestFrom3 obj = new BiggestFrom3();
        obj.output(a,b,c);
    }
}
