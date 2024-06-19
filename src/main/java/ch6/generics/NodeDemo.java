package ch6.generics;

public class NodeDemo {
    public static void main(String[] args) {
        Node node = new Node();

        node.setItem("AUEB");
        int data = (int) node.getItem(); //προκαλει ClassCastException αλλα ο μεταγλωτιστης δεν το εντοπιζει

        System.out.println(data);
    }
}
