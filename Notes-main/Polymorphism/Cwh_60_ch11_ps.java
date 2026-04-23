package company.com;

abstract class Pen{
   abstract void write();
   abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing with fountain pen");
    }

    public void refill(){
        System.out.println("Pen ink is blank filling the box");
    }

    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}


class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("Eating.....");
    }
   public  void sleep(){
        System.out.println("Sleeping....");
    }
}

// q4 class
abstract class TelePhone{
    abstract void ring();
    abstract void lift(); // abstract method
    abstract void disconnect();
    void hero(){// concrete method
        System.out.println("Hello");
    }
}

class SmartTelephone extends TelePhone{
    void ring(){
        System.out.println("Your phone is linging\n" +
                "Your phone is linging");
    }
    void lift(){
        System.out.println("Jaldi Phone Utahao\n" +
                "Phone Utahao");
    }
    void disconnect(){
        System.out.println("Network gayab ho gya");
    }
    void a(){
        System.out.println("This is smart");
    }
}

// q6 // q7

interface TVRemote{
    void on();
    void off();
//    void channelChange();
//    void volumeUp();
//    void volumeDown();
}
// by default are public
interface SmartTVRemote extends TVRemote{
    void smartOn();
    void smartOff();
}

class Tv implements SmartTVRemote{
    public void on(){
        System.out.println("On the tv");
    }
    public void off(){
        System.out.println("Off the tv");
    }
    public void smartOn(){
        System.out.println("On the tv with smartphone");
    }
    public void smartOff(){
        System.out.println("Off the tv with smartphone");
    }
    void sports(){
        System.out.println("Watching sports in TV");
    }
    // we have to write public access modifier because all methods that are in interface are by default public
    // and interface methods and class methods have to be matched.
}


public class Cwh_60_ch11_ps {
    public static void main(String[] args) {
       /* q1, 2 :-
        FountainPen pen = new FountainPen();

        pen.write();
        pen.refill();
        pen.changeNib();


        // q3
      Human Ak = new Human();
        Ak.eat();

        // q3//q5 // polymorphism

        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
//        m1.speak(); -> this gives error because the reference is monkey which does not have speak method

        BasicAnimal lavish = new Human();
        lavish.eat();
        lavish.sleep();

        // q4 again polymorphism

        TelePhone device = new SmartTelephone();
        // reference is Telephone but object is SmartTelephone.
        // I want to us SmartTelephone as Telephone.
        // for ex.

        device.ring();
//        device.a();// i cannot usse this method because i can only use smartphone as telephone
        device.hero();
        device.lift();
        device.disconnect();

        */

        // q6 // q7

//        Tv sam = new Tv();// new object is created
//
//        sam.off();
//        sam.smartOn();
//        sam.smartOff(); all methods are allow

//        TVRemote sam = new Tv();
//        sam.on();
//        sam.smartOn();// not allow // give error

        SmartTVRemote sam  = new Tv();
        sam.on();
        sam.smartOn();
//        sam.sports();

        // reference ke ander jo method hoge bas vohi method use kar sakte h.
        // uske overriding methods

    }

}

/*
two types of polymorphism :-
runtime :- reference
compile time :- overriding
 */
