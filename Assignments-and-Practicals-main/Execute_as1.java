package College_Questions;
import java.io.*;

class Student{
    String name;
    int rollNo;
    String course;

    Student(){
        course = "Ai & Ml";
    }

    void input(String n,int r){
        this.name = n;
        this.rollNo = r;
    }
}

public class Execute_as1 {
    public static void main(String[] args)
    throws IOException
    {
        int k,i,r,rr;
        String n;
        boolean result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter total number of student:- ");
        k = Integer.parseInt(br.readLine());

        Student[] obj = new Student[k];


        for(i = 0; i < k; i++){
            System.out.printf("Enter roll number of Student[%d]:- ",i+1);
            r = Integer.parseInt(br.readLine());
            System.out.printf("Enter name of Student[%d]:- ",i+1);
            n = br.readLine();

            obj[i] = new Student();// this is now new object
            obj[i].input(n,r);
        }

        System.out.print("\nEnter roll number you want to search:- ");
        rr = Integer.parseInt(br.readLine());

        result = false;

        for(i = 0;i < k ;i++){
            if(obj[i].rollNo == rr){
                result = true;
                break;
            }
        }
        System.out.println();// for new line

        if(result != true)// means false (! this is reverse)
        {
            System.out.println("Student not found");
        }
        else{
            System.out.println("Student is found\n");
            System.out.print("Student name:- ");
            System.out.println(obj[i].name);
            System.out.print("Student course:- ");
            System.out.println(obj[i].course);
        }
    }
}
// Mein naam aman hain
// mene ye code likha hai bahut aasan code h