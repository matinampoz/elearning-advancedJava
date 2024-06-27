package ch8.dao;

import ch8.model.Training;

/*
Στις ITrainee, ITraining ορίζονται τα ειδικότερα interfaces που κάνουν extends το IGenericDAO
 */
public interface ITrainingDAO extends IGenericDAO<Training> {
    Training getTrainingById(Long id);
}
