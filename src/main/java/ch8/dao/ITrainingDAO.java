package ch8.dao;

import ch8.model.Training;

public interface ITrainingDAO extends IGenericDAO<Training> {
    Training getTrainingById(Long id);
}
