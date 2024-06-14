package ch5.trainee;

public class City implements Cloneable{
    private String description;

    public City() {
    }

    public City(String description) {
        this.description = description;
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

    @Override
    public City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
}
