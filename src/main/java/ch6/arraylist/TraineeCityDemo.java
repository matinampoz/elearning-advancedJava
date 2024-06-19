package ch6.arraylist;

public class TraineeCityDemo {
    public static void main(String[] args) {
        City athens = new City();
        athens.setDescription("Athens");

        Trainee alice = new Trainee();
        alice.setName("Alice");
        alice.setCity(athens);

        if (athens.insert(alice)){
            System.out.println(alice.getName() + " was added to " + alice.getCity());
        }
    }
}
