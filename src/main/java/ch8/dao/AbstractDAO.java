package ch8.dao;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<T> implements IGenericDAO<T> {

    private Class<T> persistentClass;
    private List<T> tList = new ArrayList<>();

    public AbstractDAO() {}

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    public void setPersistentClass(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }

    @Override
    public boolean save(T t) {
        return tList.add(t);
    }

    @Override
    public void update(T t, T newT) {
        int index = tList.indexOf(t);
        tList.set(index, newT);
    }

    @Override
    public T delete(T t) {
        int index = tList.indexOf(t);
        return tList.remove(index);
    }

    @Override
    public <K extends T> K getInstanceOf(Class<K> clazz)
            throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    @Override
    public void showList() {
        System.out.println(persistentClass.getSimpleName() + " List");
        for (T listItem : tList) {
            System.out.println(listItem);
        }
    }
}
