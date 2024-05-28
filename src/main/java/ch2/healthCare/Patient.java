package ch2.healthCare;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private long amka;
    private List<Physician> physicians= new ArrayList<>();

    public Patient(String name, long amka) {
        this.name = name;
        this.amka = amka;
    }

    public void addPhysician(Physician physician){
        physicians.add(physician);
    }

    public boolean removePhysician(Physician physician) throws EmptyListException{
        if (physicians.contains(physician))
            return physicians.remove(physician);
        else
            throw new EmptyListException(Patient.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmka() {
        return amka;
    }

    public void setAmka(long amka) {
        this.amka = amka;
    }

    public List<Physician> getPhysicians() {
        return physicians;
    }

    public void setPhysicians(List<Physician> physicians) {
        this.physicians = physicians;
    }
}
