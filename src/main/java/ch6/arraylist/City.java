package ch6.arraylist;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String description;
    private List<Trainee> trainees = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    //εισαγωγη ενος trainee
    public boolean insert(Trainee trainee){
        return trainees.add(trainee);
    }

    //διαγραφη του 1ου trainee της λίστας
    public boolean delete (Trainee trainee){
        return trainees.remove(trainee);
    }

    public Trainee replace(Trainee oldTrainee, Trainee newTrainee){


        return trainees.set(findPosition(oldTrainee),newTrainee);

        /*2ος τροπος
        int index = trainees.indexOf(oldTrainee);
        //η indexOf επιστρεφει την θεση του ορισματος που παιρνει
        return trainees.set(index,newTrainee);
        //η set κανει update
         */
    }

    public int findPosition(Trainee trainee){
        return trainees.indexOf(trainee);
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }
}
