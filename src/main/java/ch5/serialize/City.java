package ch5.serialize;

import java.io.Serializable;

/**
 * Java Bean City
 *
 * author Matina Bozardeni
 */

public class City implements Serializable {
    private static final long serialVersionUID = 1L;
    private String description;

    public City() {
        this.description = "";
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
}
