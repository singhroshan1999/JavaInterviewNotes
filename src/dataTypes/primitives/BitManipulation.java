package dataTypes.primitives;

public class BitManipulation {
    public static void main(String[] args) {
        int i = 1;
        int i2 = 256;
        int i3 = -128;

        System.out.println(i + " " + Integer.toBinaryString(i));
        System.out.println(i2 + " " + Integer.toBinaryString(i2));
        System.out.println(i3 + " " + Integer.toBinaryString(i3));
        
        System.out.println((i >> 1) + " " + Integer.toBinaryString(i >> 1));
        System.out.println((i2 >> 1) + " " + Integer.toBinaryString(i2 >> 1));
        System.out.println((i3 >> 1) + " " + Integer.toBinaryString(i3 >> 1));

        System.out.println((i >>> 1) + " " + Integer.toBinaryString(i >>> 1));
        System.out.println((i2 >>> 1) + " " + Integer.toBinaryString(i2 >>> 1));
        System.out.println((i3 >>> 1) + " " + Integer.toBinaryString(i3 >>> 1));

        System.out.println((i << 1) + " " + Integer.toBinaryString(i << 1));
        System.out.println((i2 << 1) + " " + Integer.toBinaryString(i2 << 1));
        System.out.println((i3 << 1) + " " + Integer.toBinaryString(i3 << 1));
    }
}
