package dataTypes.primitives;

import java.lang.instrument.*;
import java.util.*;

public class AdvMisc {
    
    public static void main(String[] args) {
        // How would you optimize memory usage for a large array of `boolean` values?
        Boolean[] booleans = new Boolean[10];
        booleans[5] = true;
        System.out.println(Arrays.toString(booleans));
        
        // using Bit manipulation
        // do impl????
        
        // using BitSet
        
        BitSet bits = new BitSet(1_000_000);
        System.out.println(bits);
        bits.set(10);
        System.out.println(bits);
        bits.clear(10);
        System.out.println(bits);
    }
    
    // using Manual Bit Packing (for extreme optimization)
    // impl ????
    
    
}
