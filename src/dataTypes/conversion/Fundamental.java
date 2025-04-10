package dataTypes.conversion;

public class Fundamental {
    public static void main(String[] args) {
        // Type Casting
        // implicit / widening
        
        byte b = 5;
        int i = b;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        
        // Explicit / narrowing
        
        double d2 = 200.12121212121212;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        byte b2 = (byte) i2;

        System.out.println(b2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        
        
        // `char` is stored as 16-bit unicode value (unsigned)
        
        char c = 'A';
        int ic = c;
        System.out.println(c + " = " + i);
        
        // overflows
        
        byte bof = 127;
        byte bofr = (byte) (bof + 1);
        System.out.println(bof + " " + Integer.toBinaryString(bof));
        System.out.println(bofr + " " + Integer.toBinaryString(bofr));
    }
}
