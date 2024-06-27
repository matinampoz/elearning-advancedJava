package ch8.dao;

import ch8.model.Trainee;

/*
Στις ITrainee, ITraining ορίζονται τα ειδικότερα interfaces που κάνουν extends το IGenericDAO
 */
public interface ITraineeDAO extends IGenericDAO<Trainee> {
    Trainee getTraineeById(Long id);
}
