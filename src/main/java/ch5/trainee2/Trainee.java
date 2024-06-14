package ch5.trainee2;

import java.util.Objects;

public class Trainee {
    private String name;
    private City city;

    public Trainee(){}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity());
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;
        return Objects.equals(name, trainee.name) && Objects.equals(city, trainee.city);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(city);
        return result;
    }
}
