package practice;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
     /*
       int num = 1;
        while(num <= 100) {
            if(num % 2 == 0 ) {
                System.out.println(num);
            }
                num++;
        }
        */

        Scanner obj = new Scanner(System.in);
        int num,i,result;
        System.out.print("Enter the number:- ");
        num = obj.nextInt();

        for(i = 1; i <= 10; i++ ){
            result = i * num;
            System.out.printf("%d * %d is %d\n",num,i,result);
        }

    }
}
