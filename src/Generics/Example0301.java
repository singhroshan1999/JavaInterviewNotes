package Generics;

import java.util.*;

/**
 * lower + upper bound : copyList(List<? extends T> src, List<? super T> dest)
 */
public class Example0301 {
    
    static class Copy {
        static <T> void copyList(List<? extends T> src, List<? super T> dest){
            dest.addAll(src);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<Number> numberList = new ArrayList<>();
        List<Number> numberList2 = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        List<String> stringList = Arrays.asList("Hello", "world", "!");
        
        
        // case -1, copy number list to number list
        numberList.add(1);
        numberList.add(1.2);
        numberList.add(1_000_000L);
        
        for(Number i : numberList){
            System.out.println(i.getClass());
        }
        
        Copy.copyList(numberList, numberList2);
        System.out.println(numberList2);

        for(Number i : numberList2){
            System.out.println(i.getClass());
        }
        
        numberList.clear();
        
//        Copy.copyList(stringList, numberList);
        
        Copy.copyList(integerList, numberList);
        System.out.println(numberList);

        Copy.copyList(integerList, integerList2);
        System.out.println(integerList2);
        
//        Copy.copyList(integerList, doubleList); // notpossible
//        Collections.copy(doubleList, integerList); // notpossible
    }
}
