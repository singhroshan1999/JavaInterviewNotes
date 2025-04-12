package dataTypes.wrapper;

public class TrickQuestions {

    // give output autoboxing and overloading
    static void print(int i){ // what if this method is commented out
        System.out.println("int:"+i);
    }

    static void print(long i){
        System.out.println("long:" + i);
    }

    static void print(Integer i){ // what if this and above method is commented
        System.out.println("Integer:"+i);
    }

    // if you comment above two methods, we will get ambiguous error
    static void print(int ... i){
        System.out.println("Varargs:"+i[0]);
    }

    static void print(Integer ... i){
        System.out.println("VarargsInteger:"+i[0]);
    }
    //---END---

    public static void main(String[] args) {

        // give output, left-to-right execution
        System.out.println(1 + new Integer(2) + "3");
        System.out.println("1" + 2 + new Integer(3));

        // output, autoboxing and overloading
        // Exact match -> Widening -> Boxing -> Varargs (last resort)
        print(1);
        print(new Integer(1));

    }
}
