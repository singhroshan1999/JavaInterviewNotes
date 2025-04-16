package OOPS.Inheritance;

public class SuperKeyword {

    // Constructor chaining

    static class A {
        A(){
            super();
            System.out.println("A");
        }
    }

    static class B extends A {
        B() {
            super();
            System.out.println("B");
        }
    }

    static class C extends B {
        C() {
            super();
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        C c = new C(); // constructor chaining
    }
}
