package ch5.knights;

public class KnightDemo {
    public static void main(String[] args) {

        IKnight joa = new JoanOfArcKnight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Dragon was killed");
            }
        });


        joa.embarkOnMission(() -> System.out.println("Dragon was killed"));

        joa.embarkOnMission(() -> {
            System.out.println("Dragon was killed");
            System.out.println();
        });

        joa.embarkOnMission(() -> princessToSave());

        joa.embarkOnMission(KnightDemo::princessToSave);
    }

    private static void princessToSave() {
        System.out.println("Princess was saved");
    }
}
