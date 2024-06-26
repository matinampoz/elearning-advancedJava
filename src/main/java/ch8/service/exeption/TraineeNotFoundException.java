package ch8.service.exeption;

import ch8.model.Trainee;
import ch8.model.Training;

public class TraineeNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public TraineeNotFoundException(Long id) {
        super("Trainee with id " + id + " does not exist.");
    }
}
