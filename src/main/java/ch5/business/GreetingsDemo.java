package ch5.business;

public class GreetingsDemo {

    public static void main(String[] args) {

        HalloPostalService[] posts = {
                new HalloPostalService(new EmploeeImpl("Alice")),
                new HalloPostalService(new EmploeeImpl("Bob")),
                new HalloPostalService(new EmploeeImpl("Chris")),
                new HalloPostalService(new EmploeeImpl("Diana"))
        };

        for (HalloPostalService post : posts){
            new Thread(post).start();
        }
    }
}
