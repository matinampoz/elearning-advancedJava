package ch2.missionKnight;

import java.io.PrintStream;

public class SavePrincessMission extends Mission{

    public SavePrincessMission(PrintStream stream) {
        super(stream);
    }

    @Override
    public void embark(){
        stream.println("Embark on a save princess mission");
    }
}
