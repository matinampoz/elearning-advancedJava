package ch8.service;

import ch8.dao.ITraineeDAO;
import ch8.dao.ITrainingDAO;
import ch8.dto.TraineeDTO;
import ch8.dto.TrainingDTO;
import ch8.model.Trainee;
import ch8.model.Training;
import ch8.service.exeption.TraineeNotFoundException;
import ch8.service.exeption.TrainingFullyBookedException;
import ch8.service.exeption.TrainingUnavailableException;

public class AddParticipantToTrainingServiceImpl implements IAddParticipantToTrainingService{

    private final ITrainingDAO trainingDAO;
    private final ITraineeDAO traineeDAO;

    public AddParticipantToTrainingServiceImpl(ITrainingDAO trainingDAO, ITraineeDAO traineeDAO) {
        this.trainingDAO = trainingDAO;
        this.traineeDAO = traineeDAO;
    }

    @Override
    public void addParticipantToTraining(TraineeDTO traineeDTO, TrainingDTO trainingDTO)
            throws TrainingFullyBookedException {
        Trainee trainee, newTrainee;
        Training training, newTraining;

        try {

            //Extracts the data and makes a copy of trainee
            trainee = extractTrainee(traineeDTO);
            newTrainee = new Trainee(trainee);

            //Extracts the data and makes a copy of training
            training = extractTraining(trainingDTO);
            newTraining = new Training(training);

            if (training.getTrainees().size() < 25) {

                //Add trainee to the specific training participants list
                newTraining.addTrainee(trainee);
                System.out.println("Addition of a trainee with id " + traineeDTO + " successful");

                //Add training to specific Trainee 's training value object
                newTrainee.setTraining((newTraining));
                System.out.println("Addition of training with id " + trainingDTO.getTrainingId() + " successful");

                //Update persistent list of trainings
                trainingDAO.update(training, newTraining);
                System.out.println("\n...Update of Training List success...");

                //Update persistent list of trainees
                traineeDAO.update(trainee, newTrainee);
                System.out.println("\n...Update of Trainee List success...\n");

            }
                else {
                    throw new TrainingFullyBookedException(training);
                }

            } catch (TraineeNotFoundException | TrainingUnavailableException e){
                System.out.println(e.getMessage());

            }



    }
    private Trainee extractTrainee(TraineeDTO traineeDTO) throws TraineeNotFoundException {
        Trainee trainee = traineeDAO.getTraineeById(traineeDTO.getId());
        if (trainee != null) return trainee;
        else throw new TraineeNotFoundException(traineeDTO.getId());
    }

    private Training extractTraining(TrainingDTO trainingDTO) throws TrainingUnavailableException {
        Training training = trainingDAO.getTrainingById(trainingDTO.getTrainingId());
        if (training != null) return training;
        else throw new TrainingUnavailableException(trainingDTO.getTrainingId());
    }
}
