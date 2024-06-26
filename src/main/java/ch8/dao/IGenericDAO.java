package ch8.dao;

/**
 * provides crud operations
 * @param <T> generic class
 */
public interface IGenericDAO<T> {
    boolean save (T t);
    void update (T t, T newT);
    T delete(T t);
    <K extends T> K getInstanceOf(Class<K> clazz)
        throws IllegalAccessException, InstantiationException; //δημιουργει αντικειμενα της κλασης <K>
    void showList();
}
