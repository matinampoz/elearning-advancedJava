package ch2.healthCare;

import java.io.Serial;

public class EmptyListException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    EmptyListException(Class<?> entityClass){
        super("Entity " + entityClass.getSimpleName() + " is empty");
    }
}
