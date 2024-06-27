package ch8.dao;

import ch8.model.Trainee;

/*
Στις TraineeDAOImpl, TrainingDAOImpl ορίζονται οι υλοποιήσεις των ειδικών DAO κάνοντας extends το AbstractDAO και υλοποιώντας τις ειδικές μεθόδους
 */
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
