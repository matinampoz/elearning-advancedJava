package ch8.dao;

import ch8.model.Trainee;
import ch8.model.Training;

public class TrainingDAOImpl extends AbstractDAO<Training>
        implements ITrainingDAO{

    public TrainingDAOImpl() {
        this.setPersistentClass(Training.class);
    }

    @Override
    public Training getTrainingById(Long id) {
        for (Training training : gettList()) {
            if (training.getTrainingId().equals(id)) {
                return training;
            }
        }
        return null;
    }
}
