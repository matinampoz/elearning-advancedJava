package ch6.generics;

import java.io.Serializable;

public class NodeGenericBounded <T extends Number & Serializable>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
