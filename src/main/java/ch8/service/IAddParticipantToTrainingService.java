package ch8.service;

import ch8.dto.TraineeDTO;
import ch8.dto.TrainingDTO;
import ch8.model.Training;
import ch8.service.exeption.TrainingFullyBookedException;

public interface IAddParticipantToTrainingService {

    /**
     * Adds a {@link Trainee} in a {@link Training} based on the data carried by
     * the {@link TraineeDTO} and {@link TrainingDTO}.
     * @param traineeDTO the DTO object that contains Trainee data
     * @param trainingDTO the DTO object that contains Training data
     * @throws TrainingFullyBookedException if the number of participants is grater than 25
     */

    void addParticipantToTraining(TraineeDTO traineeDTO, TrainingDTO trainingDTO)
        throws TrainingFullyBookedException;
}
