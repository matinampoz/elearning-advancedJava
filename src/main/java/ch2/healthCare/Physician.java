package ch2.healthCare;

import java.util.ArrayList;
import java.util.List;

public class Physician {
    private String name;
    private long id;
    private List<Patient> patients = new ArrayList<>();

    public Physician(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void removePatient(Patient patient){
        patients.remove(patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
