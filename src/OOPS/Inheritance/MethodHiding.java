package OOPS.Inheritance;

public class MethodHiding {
    static class A {
        static void display(){
            System.out.println("A");
        }
    }

    static class B extends A {
        static void display(){ // parent class method is hidden
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A.display();
        B.display();
    }
}
