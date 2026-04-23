package company.com;

public class Cwh_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // without try
//        int c = a / b; // jese hi yaha par error aayega java program exit kar dega.
//        System.out.println("The result is " + c);

        // with try
        try {// kosis karo ise run karne ki
            int c = a / b;
            System.out.println("The result is " + c);
        }

        // agar koi exception aaye tab hi ye line print hogi.niche wali catch wala code
        catch(Exception e)// koi exception(problem) aaye toh ose catch kar lo.
        {
            // Exception is class // e is Exception class object.
        System.out.print("We failed to divide. Reason: ");
        System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
//Cwh_80_try.class -> javac -> Cwh_80_try.class {this is byte code that run on any system (windows ,linux,mac etc)}(then interpreter work here)