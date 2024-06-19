package ch6.generics;

public class GenericMethodClass {
    public static <T> void printArray(T[] array){
        for (T arrayItem : array)
            System.out.println(arrayItem);
    }

    public static void print(NodeGeneric<? super Integer> node){
        System.out.println(node.getItem());
    }
}
