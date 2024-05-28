package ch2.mathsClass;

import java.io.Serial;

public class EmptyStudentListException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    //αν δημιουργησω και αλλες ταξεις πχ ComputingClass θα μπορω να περναω την κλαση την οποια θελω ως παραμετρο.
    // τοτε το type ειναι Class και το ? σημαινει οποιαδηποτε
    EmptyStudentListException(Class<?> entityClass){
    super("Entity " + entityClass.getSimpleName() + " is empty");
    }
}
