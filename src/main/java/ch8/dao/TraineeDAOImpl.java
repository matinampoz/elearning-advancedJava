package ch8.dao;

import ch8.model.Trainee;


public class TraineeDAOImpl extends AbstractDAO<Trainee>
        implements ITraineeDAO {

    public TraineeDAOImpl(){
        this.setPersistentClass(Trainee.class);
    }

    @Override
    public Trainee getTraineeById(Long id) {
        for (Trainee trainee : gettList()) {
            if (trainee.getId().equals(id)) {
                return trainee;
            }
        }
        return null;
    }
}
