package ch5.threads;

public class KillDragonMission extends AbstractMission{


    public KillDragonMission() {
        setStatus(MissionStatus.NOT_STARTED);
    }

    @Override
    public void embark() {
        System.out.println("Dragon will be killed");
    }
}
