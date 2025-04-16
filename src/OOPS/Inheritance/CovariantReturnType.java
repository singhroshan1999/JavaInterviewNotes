package OOPS.Inheritance;

public class CovariantReturnType {

    static class A { }

    static class B extends A { }

    static class Parent1 {
        A getObj(){ return new A();}
    }

    static class Child1 extends Parent1 {
        @Override
        B getObj(){ return new B();}
    }

    static class Parent2 {
        B getObj(){ return new B();}
    }

    static class Child2 extends Parent1 {
        @Override
        A getObj(){ return new A();}
    }

    public static void main(String[] args) {
        new Child1().getObj();
        new Child2().getObj();
    }
}
