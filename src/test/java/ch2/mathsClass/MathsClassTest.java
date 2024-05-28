package ch2.mathsClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class MathsClassTest {

    private static MathsClass mathsClass;
    private Student student;

    @BeforeAll //τρεχει 1 μονο φορα
    public static void setUpClass(){
        //δημιουργω για το testing ολων των μεθοδων 1 φορα 1 ταξη με 10 μαθητες
        //τρεχει 1 φορα οποτε πρεπει να ειναι static
        mathsClass = new MathsClass(10);
    }

    @BeforeEach //δη,ιουργει dummydata, τρεχει πριν απο καθε test μεθοδο
    void setUp() {
        createDummyData();
    }

    @AfterEach //εκαθαριζει αυτα η που @BeforeEach εχει δημιουργησει
    void tearDown() {
        eraseData();
    }

    @Test
    void testAddStudentToClass(){
        mathsClass.addStudentToClass(student);
        //αφου τον προσθεσω τεσταρω αν η λιστα εχει μεγεθος 1
        assertEquals(mathsClass.getStudentList().size(), 1);
    }

    @Test
    void testRemoveStudentFromClass() throws EmptyStudentListException{
        mathsClass.addStudentToClass(student);
        boolean removed = mathsClass.removeStudentFromList(student);
        assertEquals(mathsClass.getStudentList().size(), 0);
        assertTrue(removed);
    }

    @Test
    void testRemoveStudentFromEmptyList() throws EmptyStudentListException{
        //εδω δεν κανω add τον student
        // το .class επιστρεφει το αντικειμενο της κλασης
        //δινω με lamda την μεθοδο που δημιουργει το exception
        EmptyStudentListException e = assertThrows(EmptyStudentListException.class, () -> {mathsClass.removeStudentFromList(student);});
        assertEquals("Entity MathsClass is empty", e.getMessage());
    }

    private void createDummyData(){
        student = new Student("Matina", "Bozardeni");
    }

    public void eraseData(){
        Iterator<Student> itr = mathsClass.getStudentList().iterator();
        while (itr.hasNext()){
            Student s = itr.next();
            itr.remove();
        }
    }
}