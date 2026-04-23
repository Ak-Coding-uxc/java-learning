package practice;

import java.io.*;

class Arithmetic{
    private int a,d,n,i;

   public Arithmetic(int first,int diff,int num){
       this.a = first;
       this.d = diff;
       this.n = num;
   }

   void operation(){
       int k = 1;
       for(i = a; i <= a + (n-1)*d;i = a+(k-1)*d){
           System.out.print(i + " ");
           k++;
       }
   }

}

public class Math_Ap {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,d,num;
        System.out.print("Enter how many series number you want to print:- ");
        num = Integer.parseInt(br.readLine());

        System.out.print("Enter Starting number:- ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter difference you want in between them:- ");
        d = Integer.parseInt(br.readLine());

        Arithmetic ap = new Arithmetic(a,d,num);

        ap.operation();
    }
}
