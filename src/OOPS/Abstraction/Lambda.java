package OOPS.Abstraction;

import java.util.*;

public class Lambda {
    
    // Creating interface to act as functional interface
    
    @FunctionalInterface
    interface FunInterface {
        void doSomeThing();
    }
    
    // END
    
    public static void main(String[] args) {
        // Lambda vs Non-Lambda Runnable
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Non-Lambda runnable");
            }
        };
        
        Runnable runnableLambda = () -> System.out.println("Lambda runnable");
        
        new Thread(runnable).start();
        new Thread(runnableLambda).start();
        
        // Lambda vs Non-Lambda Comparator Comparator
        
        Integer[] array = new Integer[]{6,5,3,7,8,2,1,56,23,7,9};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // reverse int array
                return o2 - o1;
            }
        };
        
        Comparator<Integer> comparatorLambda = (a, b) -> b - a;
        
        Arrays.sort(array, comparatorLambda);

        System.out.println(Arrays.toString(array));
        
        // Creating interface to act as functional interface
        
        FunInterface funInterface = () -> System.out.println("Functional Interface");
        funInterface.doSomeThing();
        
        
    }
}
