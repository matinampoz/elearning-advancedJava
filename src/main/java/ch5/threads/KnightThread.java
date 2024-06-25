package ch5.threads;

public class KnightThread implements IKnight, Runnable{

    private final AbstractMission[] missions;

    public KnightThread(AbstractMission[] missions){
        this.missions = missions;
    }
    @Override
    public void embarkOnMission(AbstractMission mission) {
        mission.embark();
    }

    @Override
    public void run() {

        synchronized (missions) {

            for (AbstractMission mission : missions) {

                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    embarkOnMission(mission);
                    mission.setStatus(MissionStatus.STARTED);
                }
            }
        }
    }
}
