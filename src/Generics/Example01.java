package Generics;

/**
 * A -> Parent class
 * B -> Child Class (extends A)
 * GenCls -> Generic Class which call static display method.
 * What will be the output of `GenCls<B> genCls = new GenCls<>(); genCls.show();`?
 * TIP: It is usually bad idea to use static members with generics
 */
public class Example01 {
    
    static class A {
        static void display(){
            System.out.println("Parent");
        }
    }
    
    static class B extends A {
        static void display(){
            System.out.println("child");
        }
    }
    
    static class GenCls<T extends A> {
        void show(){
            T.display();
        }
    }

    public static void main(String[] args) {
        B.display();
        GenCls<B> genCls = new GenCls<>();
        genCls.show();
    }
}
