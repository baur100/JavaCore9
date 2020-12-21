package lesson11Dec12;

public class Address {
    private String streetName;
    private String city;
    private StatesOB state;
    private int zip;

    public Address(String streetName, String city, StatesOB state, int zip) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String toString() { // So we can print it as string (from App1OB Class)
        return "Address ===============\n" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip;
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

    public StatesOB getState() {
        return state;
    }

    public void setState(StatesOB state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
