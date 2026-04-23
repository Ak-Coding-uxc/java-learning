package College_Questions;

import java.util.Scanner;

class Student{
    String name;
    static Scanner o = new Scanner(System.in);

    Student(){
        System.out.print("Enter name :- ");
        name = o.nextLine();

//        System.out.print("Enter father name :- ");
//        fatherName = o.nextLine();
    }

}

public class Execute7 {
    public static void main(String[] args) {
//        Scanner o = new Scanner(System.in);
        int i;
        Student[] obj = new Student[5];

        for(i = 0;i < 5;i++){
            obj[i] = new Student();
        }

        System.out.println("Enter which name you want to check:- ");
        String checkName = Student.o.nextLine();

        int result = 0;

       for(i = 0;i < 5;i++){
           if(obj[i].name.equals(checkName)){
               System.out.println("Name is found");
               result = 1;
               break;
           }
       }

       if(result != 1){
           System.out.println("Name is not found");
       }
    }
}
