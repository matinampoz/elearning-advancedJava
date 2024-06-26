package ch8.service.exeption;

import ch8.model.Training;

public class TrainingFullyBookedException extends Exception{
    private static final long serialVersionUID = 1L;

    public TrainingFullyBookedException(Training training) {
        super("Training with id " + training.getTrainingId() + " is already booked.");
    }
}
