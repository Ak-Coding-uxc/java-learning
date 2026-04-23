class Pen{
    String bodyColor;// perimeter, attribute, variable of class etc.
    String inkColor;
    String type;// gel ,ball etc

    public void write(){
        System.out.println("writing something");
    }

    public void color(){// method
        System.out.println("The pen body color is " + this.bodyColor);
        System.out.printf("The pen ink color is %s\n",inkColor);
        System.out.format("The Pen type is %s\n",type);
        //.format work same as printf
        // format return new string can be store in any String variable.
    }

}

class Student{
    String name;
    long rollNo;
    int age;

    public void printInfo(){
        System.out.println("Name of student is " + this.name);
        System.out.println("Roll Number of student is " + this.rollNo);
        System.out.println("The age of student is " + this.age);
    }
/*
// types of constructors
1. non parameterised constructor (that does not any arguments).

2. parameterised constructors
    Student(String name,long rollNo,int age){// this is parameterised constructor
//        System.out.println("Construction Called");
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.printInfo();
    }
*/
    // 3. Copy constructors
Student(Student j){
    this.name = j.name;
    this.rollNo = j.rollNo;
    this.age = j.age;
    this.printInfo();
}

Student(){// empty constructors for s1.

}

}

public class OOPS {
    public static void main(String[] args){

        /*
        Pen pen1 = new Pen();
        pen1.bodyColor = "Green";
        pen1.inkColor = "Blue";
        pen1.type = "Ball Pen";
        // String is a group of characters.
        pen1.write();
        pen1.color();
        */

        Student s1 = new Student();

        s1.name = "Aman";
        s1.rollNo = 230611003333L;
        s1.age = 21;

        Student s2 = new Student(s1);// s1 object in constructor (copy type).

    }
}
