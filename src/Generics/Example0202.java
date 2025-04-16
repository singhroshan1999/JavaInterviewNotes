package Generics;

import java.util.*;

/**
 * A -> Parent class
 * B -> Child Class (extends A)
 * GenCls -> Generic Class which call static display method.
 * What will be the output of `GenCls<B> genCls = new GenCls<>(); genCls.show();`?
 * TIP: It is usually bad idea to use static members with generics
 */
public class Example0202 {
    
    static class A {
        void display(List<?> list){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        new A().display(Arrays.asList(1,2,3,4));
    }
}
