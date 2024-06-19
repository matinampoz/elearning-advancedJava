package ch6.generics;

/**
 * ορίζει μία κλαση Node με ένα πεδίο Object
 * αναπαριστα εναν κομβο πχ λιστας
 */
public class Node {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
