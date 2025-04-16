package OOPS.Inheritance;

public class DiamondProblem {

     interface A{ // inner interfaces
        default void display(){
            System.out.println("A");
        }
    }

    interface B extends A {
         default void display(){
             System.out.println("B");
         }
    }

    interface C extends A {
        default void display(){
            System.out.println("C");
        }
    }

    interface D extends B, C { // throws error because we have B.display() and C.display()
         default void display(){ // this will fix that error
             System.out.println("D");
         }

    }

    public static void main(String[] args) {
        D d = new D() { // anonymous class
            @Override
            public void display() {
                D.super.display();
            }
        };
        d.display();
    }
}
