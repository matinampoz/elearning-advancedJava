package ch6.generics;

public class GenericMethodClass {

    public static <T> void printArray(T[] array){
        for (T arrayItem : array)
            System.out.println(arrayItem);
    }

    //χρηση του ?, υπερτυπος όλων των παραμετρικών τύπων. (Μπορω επίσης να χρησιμοποιησω υπερτύπους και υποτύπους με super και extends)
    public static void print(NodeGeneric<?> node){
        System.out.println(node.getItem());
    }
}
