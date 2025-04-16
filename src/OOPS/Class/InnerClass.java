package OOPS.Class;

public class InnerClass {
    
    private static final double PI = 3.14;
    private int a;
    
    InnerClass(){
        a = 5;
    }
    class NonStaticInnerClass { // Inner Class (Non-Static Nested Class)
        
        // static int PI = 3.14; // Cannot define static members inside it (Java 8 and below)
        
        void display(){ 
            // Has access to all members (including private) of the outer class.
            System.out.println(a);
        }
    }
    
    static class StaticInnerClass {
        static void staticDisplay(){
            System.out.println("StaticDisplay:" + PI);
        }
        
        void display(){
            System.out.println("display:" + PI);
        }
    }

    // Non-Static interface

    @FunctionalInterface // this won't affect result
    interface NonStaticInnerInterface {
        int A = 5;
        void display();
    }

    // static interface

    @FunctionalInterface // this won't affect result
    interface StaticInnerInterface {
        int A = 5;
        void display();
    }

    public static void main(String[] args) {
        // Non-Static inner class initialization, 
        // Requires an instance of the outer class to instantiate.
        new InnerClass(). new NonStaticInnerClass().display(); // ugly
        
        InnerClass innerClass = new InnerClass(); // less ugly
        InnerClass.NonStaticInnerClass nonStaticInnerClass = innerClass.new NonStaticInnerClass();
        nonStaticInnerClass.display();
        
        //Static innerclass
        // calling static method
        InnerClass.StaticInnerClass.staticDisplay();
        
        //Initialization
        
        InnerClass.StaticInnerClass staticInnerClass = new InnerClass.StaticInnerClass();
        staticInnerClass.display();
        
        // Both static an Non-static interface will show same behaviour 
        
        NonStaticInnerInterface nonStaticInnerInterface = 
                () -> System.out.println("nonStaticInnerInterface");
        
        StaticInnerInterface staticInnerInterface =
                () -> System.out.println("staticInnerInterface");
        System.out.println("NonStaticInnerInterface.A:" + NonStaticInnerInterface.A);
        System.out.println("StaticInnerInterface.A:" + StaticInnerInterface.A);
    }
}
