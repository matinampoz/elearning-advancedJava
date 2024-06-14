package ch5.trainee;

public class TraineeDriver {

    public static void main(String[] args) throws CloneNotSupportedException {
        Trainee alice = new Trainee("Alice", new City("Athens"));

        Trainee bob = alice.clone();
        bob.setName("Bob");
        bob.setCity(new City("New York"));

        System.out.println(alice);
        System.out.println(bob);
    }
}
