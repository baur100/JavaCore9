package lesson11SO03;

public class SO03Address {
    private String streetName;
    private String city;
    private SO03State state;
    private int zip;

    public SO03Address(String streetName, String city, SO03State state, int zip) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return "SO03Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                '}';
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

    public SO03State getState() {
        return state;
    }

    public void setState(SO03State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
