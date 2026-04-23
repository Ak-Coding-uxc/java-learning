package College_Questions;

import java.util.Scanner;

class Add1{
    private int sum,num;

    public Add1(){
        sum = 0;
    }

    public void set_Value(int n){
        this.num = n;
    }

    public int total(){
        while(num !=0){
            sum = sum + num % 10;// add num last digit.
            num = num / 10;
        }
        return sum;
    }
}

public class Execute_Sum {
    public static void main(String[] args) {
        int num,digitSum;
        // Creating objects
        Scanner scan = new Scanner(System.in);
        Add1 sobj = new Add1();

        System.out.print("Enter number:- ");

        num = scan.nextInt();

        sobj.set_Value(num);

        digitSum = sobj.total();

        System.out.printf("The Digit Sum of %d is %d\n",num,digitSum);

        scan.close();
    }
}
