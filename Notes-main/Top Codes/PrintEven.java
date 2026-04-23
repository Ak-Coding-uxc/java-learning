package practice;

public class PrintEven {
    public static void main(String[] args) {
        int num;
        /*
        for(num = 0; num <= 100; num++){
            if(num % 2 != 0) {
                System.out.println(num);
            }
        }
        */

        for(num = 1; num <= 100; num++){
            if(num % 2 == 0) {
                System.out.print("Even:- ");
                System.out.println(num);
            }

            else{
                System.out.print("Odd :- ");
                System.out.println(num);
            }
        }
    }
}
/*
0
2
num = num + 2 = 2 + 2 = 4....
 */