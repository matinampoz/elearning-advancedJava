package ch8.model;

public class Trainee {
    private Long id;
    private String firstname;
    private String lastName;
    private Training training;

    public Trainee() {
    }

    //copy constructor
    public Trainee(Trainee trainee) {
        this.id = trainee.id;
        this.firstname = trainee.firstname;
        this.lastName = trainee.lastName;
        this.training = trainee.training;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", training=" + training +
                '}';
    }
}
