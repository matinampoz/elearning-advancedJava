package ch2.healthCare;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    private static Patient patient;
    private Physician physician;

    @BeforeAll
    public static void setUpPatient(){
        patient = new Patient("Μαρία", 12345);
    }

    @BeforeEach
    void setUp() {
        createDummyData();
    }

    @AfterEach
    void tearDown() {
        eraseData();
    }

    @Test
    void testAddPhysician(){
        patient.addPhysician(physician);
        assertEquals(patient.getPhysicians().size(), 1);
    }

    @Test
    void testRemovePhysician() throws EmptyListException{
        patient.addPhysician(physician);
        boolean removed = patient.removePhysician(physician);
        assertEquals(patient.getPhysicians().size(), 0);
        assertTrue(removed);
    }

    private void createDummyData(){
        physician = new Physician("Ελένη", 6789);
    }

    public void eraseData(){
        Iterator<Physician> itr = patient.getPhysicians().iterator();
        while (itr.hasNext()){
            Physician ph = itr.next();
            itr.remove();
        }
    }
}