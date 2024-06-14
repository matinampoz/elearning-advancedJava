package ch5.serialize;

import java.io.Serializable;

/**
 * Java Bean Trainee
 */
public class Trainee implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private City city;

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
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
}
