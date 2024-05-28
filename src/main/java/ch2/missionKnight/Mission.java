package ch2.missionKnight;

import java.io.PrintStream;

public class Mission {
    protected PrintStream stream;

    public Mission(PrintStream stream) {
        this.stream = stream;
    }

    public void embark(){
        stream.println("Embark on a generic mission");
    }
}
