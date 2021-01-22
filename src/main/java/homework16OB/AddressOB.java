package homework16OB;

public class AddressOB {
    private String streetAddress;
    private String zip;
    private String city;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressOB(String streetAddress, String zip, String city) {
        this.streetAddress = streetAddress;
        this.zip = zip;
        this.city = city;


    }
}
