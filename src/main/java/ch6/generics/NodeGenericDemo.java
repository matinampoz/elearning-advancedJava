package ch6.generics;

public class NodeGenericDemo {
    public static void main(String[] args) {
        NodeGeneric<Integer> node1 = new NodeGeneric<>();
        NodeGeneric<String> node2 = new NodeGeneric<>();

        node1.setItem(1);
        node2.setItem("AUEB");

        int data = node1.getItem();
        /*
        εντοπιζεται κατα την διαρκεια της μεταγλωττισης
        int data2 = node2.getItem();
         */

        String data2 = node2.getItem();

        System.out.println(data);
        System.out.println(data2);
    }
}
