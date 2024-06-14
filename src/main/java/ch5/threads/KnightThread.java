package ch5.threads;

public class KnightThread implements IKnight, Runnable{

    private final AbstractMission[] missions;

    public KnightThread(AbstractMission[] missions){
        this.missions = missions;
    }
    @Override
    public void embarkOnMission(AbstractMission mission) {

    }

    @Override
    public void run() {

    }
}
