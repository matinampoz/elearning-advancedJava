package ch5.threads;

public class SavePrincessMission extends AbstractMission{

    public SavePrincessMission() {
        setStatus(MissionStatus.NOT_STARTED);
    }

    @Override
    public void embark() {
        System.out.println("Princess will be saved");
    }
}
