package lesson12SO03;

public class SO03L12Person {
    protected String name;
    protected String lastName;
    protected SO03L12Address address;

    public SO03L12Person(String name, String lastName, SO03L12Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SO03L12Address getAddress() {
        return address;
    }

    public void setAddress(SO03L12Address address) {
        this.address = address;
    }
}
