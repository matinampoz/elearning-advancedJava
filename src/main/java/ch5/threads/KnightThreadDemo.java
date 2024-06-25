package ch5.threads;

public class KnightThreadDemo {
    public static void main(String[] args) {

        AbstractMission[] missions = {
                new SavePrincessMission(),
                new KillDragonMission()
        };

        KnightThread knightThread1 = new KnightThread(missions);
        KnightThread knightThread2 = new KnightThread(missions);

        new Thread(knightThread1).start();
        new Thread(knightThread2).start();

    }
}
