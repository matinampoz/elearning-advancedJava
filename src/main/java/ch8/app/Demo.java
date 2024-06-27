package ch8.app;

import ch8.dao.ITraineeDAO;
import ch8.dao.ITrainingDAO;
import ch8.dao.TraineeDAOImpl;
import ch8.dao.TrainingDAOImpl;
import ch8.dto.TraineeDTO;
import ch8.dto.TrainingDTO;
import ch8.model.Trainee;
import ch8.model.Training;
import ch8.service.AddParticipantToTrainingServiceImpl;
import ch8.service.IAddParticipantToTrainingService;
import ch8.service.exeption.TrainingFullyBookedException;

public class Demo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, TrainingFullyBookedException {
        /*
         * Instantiate DAO Layer
         */
        ITraineeDAO traineeDAO = new TraineeDAOImpl();
        ITrainingDAO trainingDAO = new TrainingDAOImpl();

        /*
         * Instantiate Service Layer
         * Δημιουργούμε το service AddParticipantToTrainingService με τα DAO του constructor

         */
        IAddParticipantToTrainingService addParticipantToTrainingService =
                new AddParticipantToTrainingServiceImpl(trainingDAO, traineeDAO);



        Trainee alice = traineeDAO.getInstanceOf(Trainee.class);
        alice.setId(1L);
        alice.setFirstname("Alice");
        alice.setLastName("In Wonderland");

        Trainee harry = traineeDAO.getInstanceOf(Trainee.class);
        harry.setId(2L);
        harry.setFirstname("Harry");
        harry.setLastName("Potter");

        Trainee matilda = traineeDAO.getInstanceOf(Trainee.class);
        matilda.setId(3L);
        matilda.setFirstname("Matilda");
        matilda.setLastName("Wormwood");

        traineeDAO.save(alice);
        traineeDAO.save(harry);
        traineeDAO.save(matilda);

        Training javaEntry = trainingDAO.getInstanceOf(Training.class);
        javaEntry.setTrainingId(1L);
        javaEntry.setDescription("Java Entry to mid level");
        javaEntry.setTitle("Java Entry Level");

        trainingDAO.save(javaEntry);

        traineeDAO.showList();
        trainingDAO.showList();

        //προσθηκη 1ου εκπαιδευομενου σε σεμιναριο και εμφανιση λίστας
        TraineeDTO traineeDTO = new TraineeDTO();
        traineeDTO.setId(1L);
        TrainingDTO trainingDTO = new TrainingDTO();
        trainingDTO.setTrainingId(1L);

        try {
            //Καλούμε το service με παραμέτρους τα DTOs
            addParticipantToTrainingService.addParticipantToTraining(traineeDTO, trainingDTO);
        } catch (TrainingFullyBookedException e) {
            System.out.println(e.getMessage());
        }

        traineeDAO.showList();


        //προσθηκη 2ου εκπαιδευομενου σε σεμιναριο και εμφανιση λίστας
        traineeDTO.setId(2L);
        trainingDTO.setTrainingId(1L);
        try {
            //Καλούμε το service με παραμέτρους τα DTOs
            addParticipantToTrainingService.addParticipantToTraining(traineeDTO, trainingDTO);
        } catch (TrainingFullyBookedException e) {
            System.out.println(e.getMessage());
        }

        traineeDAO.showList();
    }
}
