package College_Questions;
import java.util.Scanner;

class High{
    private int a,b,c,biggest;

    void input(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value of a:- ");
        a = obj.nextInt();

        System.out.print("Enter value of b:- ");
        b = obj.nextInt();

        System.out.print("Enter value of c:- ");
        c = obj.nextInt();
    }

    void output(){
        if (a > b && a > c) {
            biggest = a;
        }
        else if (b > a && b > c) {
            biggest = b;
        }
        else {
            biggest = c;
        }
        System.out.println("The biggest number is: " + biggest);
    }
}

public class Execute3 {
    public static void main(String[] args) {
High obj = new High();
obj.input();
obj.output();
    }
}
