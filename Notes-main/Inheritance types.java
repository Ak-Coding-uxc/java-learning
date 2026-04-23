/*
This is about Inheritance in java
Different types of Inheritance used in java :- 
1. Single level Inheritance
2. Multilevel Inheritance
3. Hybrid Inheritance
4. Hierarchical Inheritance
*/

// 1. Single level Inheritence
class Shape {
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{}
public void area(int l,int h){
    System.out.println(1/2 * l * h);
}

// 2. Multilevel Inheritance
//class EquilateralTriangle extends Triangle{ // all side are equal
//    public void area(int l,int h){
//        System.out.println(1/2 * l * h);
//    }
//}

// 3. Hierarchical Inheritence
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14) * r * r);
    }
}

// 4.  Hybrid Inheritance -> Different types of Inheritance in one place.


public class oops4 {
    public static void main(String[] args){

    }

}
