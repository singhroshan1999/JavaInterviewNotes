package dataTypes.wrapper;

public class Fundamental {
    Integer id;
    
    public static void main(String[] args) {
        // default value of wrapper is null
        // For method local variable it is undefined and will throw error if accessed
        Fundamental fundamental = new Fundamental();
        System.out.println(fundamental.id);
        
        // Converting primitive type to wrapper type
        
        // Autoboxing
        
        int i = 5;
        Integer I = i;
        System.out.println(i);
        System.out.println(I);
        
        // Autounboxing
        
        int j = I;

        System.out.println(j);
        
        // converting string to int
        
        String sn = "123";
        int is = Integer.parseInt(sn); // returns `int`
        Integer Is = Integer.valueOf(sn); // returns `Integer`
        System.out.println(is + " " + Is);
        
        // converting int to string
        
        int ii = 123;
        String is1 = Integer.toString(ii);
        String is2 = String.valueOf(ii);
        String is3 = Integer.toString(ii, 16); // with radix / base
        System.out.println(is1 + " " + is2 + " " + is3);
        
        // Comparing 
        
        Integer ia = 123;
        Integer ib = 200;
        
        System.out.println(ia.equals(ib)); // using equals()
        System.out.println(ia.compareTo(ib)); // using compareTo()

        // Ternary operator
        boolean flag = true;
//        int ter = flag ? 10 : 20.0; // incorrect, 10 is converted to double

        // Autoboxing Object object
        Object o = 5;
        System.out.println(o instanceof Double); // false
        System.out.println(o instanceof Integer); // true
        System.out.println(o.getClass());
    }
}
