package ch2.missionKnight;

import java.io.PrintStream;

public class KillDragonMission extends Mission{

    public KillDragonMission(PrintStream stream) {
        super(stream);
    }

    @Override
    public void embark(){
        stream.println("Embark on a kill a dragon mission");
    }
}
