package ch9.model;

import java.util.ArrayList;
import java.util.List;

public class Training {
    private Long trainingId;
    private String title;
    private String description;
    private List<Trainee> trainees = new ArrayList<>();

    public Training() {
    }

    //copy constructor
    public Training(Training training) {
        this.trainingId = training.trainingId;
        this.title = training.title;
        this.description = training.description;
        this.trainees = training.trainees;
    }

    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    public void addTrainee(Trainee trainee) {
        trainees.add(trainee);
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainingId=" + trainingId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", trainees=" + trainees +
                '}';
    }
}
