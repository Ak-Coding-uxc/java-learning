import java.util.Scanner;

public class Factorial {

    public int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * fact(num - 1);// 5 * 4 // 4 * 3// 3 *2 // 2 * 1
    }
    // 5 * 4 * 3 * 2 * 1; // Factorial
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int num = a.nextInt();// method of Scanner class

        Factorial f = new Factorial();// this call default constructor.
        int fact = f.fact(num);

        System.out.printf("The factorial of number %d is %d\n",num, fact);

    }
}
