package dataTypes.primitives;

public class Fundamental {
    byte ob;
    short os;
    int oi;
    long ol;

    float of;
    double od;

    char oc;
    boolean obool;
    
    public static void main(String[] args) {
        /* uninitialized variables */
        byte b;
        short s;
        int i;
        long l;
        
        float f;
        double d;
        
        char c;
        boolean bool;
        
        /* // compile time error
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        
         */
        
        // returns default values
        Fundamental fundamental = new Fundamental();
        System.out.println(fundamental.ob);
        System.out.println(fundamental.os);
        System.out.println(fundamental.oi);
        System.out.println(fundamental.ol);
        System.out.println(fundamental.of);
        System.out.println(fundamental.od);
        System.out.println(fundamental.oc);
        System.out.println(fundamental.obool);
        
        // underscore `long` declaration
        
        long unl = 1_000_000_000L;
        System.out.println(unl);
    }
}
