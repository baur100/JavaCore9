package homeWork1011SO03;

public class SO03HW1011Contacts extends SO03HW1011Staff{
    private String email;
    private String street;
    private String city;
    private String state;
    private int zip;

    public SO03HW1011Contacts(String name, String lastName, String department,String email, String street, String city, String state, int zip) {
        super(name,lastName,department);
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
