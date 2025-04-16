package Generics;

/**
 * A -> Parent class
 * B -> Child Class (extends A)
 * GenCls -> Generic Class which call static display method.
 * What will be the output of `GenCls<B> genCls = new GenCls<>(); genCls.show();`?
 * TIP: It is usually bad idea to use static members with generics
 */
public class Example0101 {
    
    static class A {
        void display(){
            System.out.println("Parent");
        }
    }
    
    static class B extends A {
        void display(){
            System.out.println("child");
        }
    }
    
//    static class GenCls<T super B> { // we can't use it on class
//        
//    }
    
    static class GenCls {
//        void show(<? super B> obj){
////          obj.display();  
//        }
    }

    public static void main(String[] args) {
//        B.display();
//        GenCls<B> genCls = new GenCls<>();
//        genCls.show();
    }
}
