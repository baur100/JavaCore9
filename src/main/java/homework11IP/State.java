package homework11IP;

public class State {
    private String name;
    private City[] cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public State(String name, City[] cities) {
        this.name = name;
        this.cities = cities;
    }
}
