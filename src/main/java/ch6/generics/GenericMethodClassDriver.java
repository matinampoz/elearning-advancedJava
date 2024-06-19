package ch6.generics;

public class GenericMethodClassDriver {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Athens", "University"};

        GenericMethodClass.printArray((intArray));
        GenericMethodClass.printArray(strArray);
    }
}
