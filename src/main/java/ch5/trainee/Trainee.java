package ch5.trainee;

public class Trainee implements Cloneable{
    private String name;
    private City city;

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.city = city;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone(); //αρχικά γλινεται shallow copy
        trainee.city = new City(this.getCity().getDescription()); //το city του trainee παιρνει νέα αναφορα
        return trainee;
    }
}
