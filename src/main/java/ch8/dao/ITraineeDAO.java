package ch8.dao;

import ch8.model.Trainee;

public interface ITraineeDAO extends IGenericDAO<Trainee> {
    Trainee getTraineeById(Long id);
}
