package ch5.trainee2;

public class City {
    private String description;

    public City() {
        this.description = "";
    }

    public City(String description) {
        this.description = description;
    }

    //copy constructor
    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }
}
