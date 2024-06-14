package ch5.threads;

public abstract class AbstractMission implements IMission{
    private MissionStatus status;

    @Override
    public void embark() {}

    public MissionStatus getStatus() {
        return status;
    }

    public void setStatus(MissionStatus status) {
        this.status = status;
    }
}
