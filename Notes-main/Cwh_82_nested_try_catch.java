package company.com;

import java.util.Scanner;

public class Cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            try {
        System.out.println("Enter the value of index:- ");
        int ind = sc.nextInt();
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);// jab ye line correct hogi tab hi flag false hoga.
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry  this index does not exit");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
