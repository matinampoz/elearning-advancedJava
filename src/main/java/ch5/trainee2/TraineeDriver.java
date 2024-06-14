package ch5.trainee2;

public class TraineeDriver {
    public static void main(String[] args) {
        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee bob = new Trainee(alice);

        bob.setName("Bob");
        bob.setCity(new City("New York"));

        System.out.println(alice);
        System.out.println(bob);
    }
}
