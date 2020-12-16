package lesson12SO03;

import lesson11SO03.SO03State;

public class SO03L12Address {
    private String streetName;
    private String city;
    private SO03L12State state;
    private int zip;

    public SO03L12Address(String streetName, String city, SO03L12State state, int zip) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SO03L12State getState() {
        return state;
    }

    public void setState(SO03L12State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "SO03L12Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                '}';
    }
}
