package ch5.knights;

public class AbstractKnight implements IKnight{

    @Override
    public void embarkOnMission(IMission mission) {

        mission.embark();
    }
}
