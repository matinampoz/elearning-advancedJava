package ch6.generics;

public class NodeGeneric <T>{
    //<Τ> παραμετρικος τυπος για type

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
