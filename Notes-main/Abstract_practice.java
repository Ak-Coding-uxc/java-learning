// most confusing
// abstract class have abstract methods.
// abstract class cannot be used to make objects.

// abstract methods are those which are not implement.
// concrete methods are those methods which are implement.

// implement means body.(code)

// abstract class have both abstract and  concrete methods.

/* used :-
joh chize common hain unko abstract class mein likh sakte hai.
 */

// /|\ abstract class can only be access by use of subclass.

import java.util.Scanner;
abstract class Phone2{
    public abstract void ram(int r);// abstract method

    public void powerOn(){
        System.out.println("Power on by pressing power button");
    }

    public void powerOff(){
        System.out.println("Power off by pressing power button");
    }

}

class Redmi extends Phone2{
    public void ram(int r){
        System.out.println("The phone have " + r + " ram");
    }
}

abstract class ta extends Phone2{
    public void Sound(){
        System.out.println("Beap beap baeap");
    }
}

public class Abstract_practice {
    public static void main(String[] args) {
        Phone2 first;// reference

        first = new Redmi();// Actual Object

        first.ram(3);
        first.powerOn();
        first.powerOff();
    }
}
