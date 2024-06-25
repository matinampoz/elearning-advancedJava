package ch6.arraylist;

import java.util.List;

public interface IGeneric<T> {
    boolean save(T t);
    T update(T t, T ta);
    T delete(T t);
    List<T> getAll();
    <K extends T> K getInstanceOf(Class<K> k)
            throws IllegalAccessException, InstantiationException;
    void showList();
}
