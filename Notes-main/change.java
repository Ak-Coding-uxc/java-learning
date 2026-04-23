package practice;

public class change {
    public static void main(String[] args) {
        int a;
        int b;

         a = 22;
         b = 23;

        System.out.printf("a = %d ,, b = %d", a ,b);

         a = a + b; // 22 + 23 = 45

        b = a - b; // now 45 - 23 = 22.

        a = a - b; // 45 - 22 = 23

        System.out.println();

        System.out.printf("a = %d ,, b = %d", a ,b);

    }
}
