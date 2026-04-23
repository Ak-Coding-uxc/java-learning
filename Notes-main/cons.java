package company.com;

class cd{
    int x;

    cd(){// this is default constructor
        System.out.println("Hello");
    }
    /*this is default constructor cannot be access
from outside the package only access from inside the  same package
that are in created.
 */

    cd(cd s){ // this is copy constructor
        x = s.x;
    }

    cd(int y){ // this is parameterised constructor
        this.x = y;
    }

    public int getX() {
        return x;
    }
}
 public class cons {
    public static void main(String[] args) {

        cd obj = new cd(); // call default constructor.
        obj.x = 90;

        cd obj1 = new cd(obj);// call copy constructor.

        cd obj2 = new cd(6);// call parameterised constructor.

        System.out.println("The value of obj x attribute is " + obj.getX());

        System.out.println("The value of obj2 x attribute is " + obj1.getX());

        System.out.println("The value of obj3 x attribute is " + obj2.getX());
    }
}
