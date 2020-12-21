package lesson12Dec14;

public class PersonOB {
    private String name;
    private String lastName;
    private AddressOB address;

    public PersonOB(String name, String lastName, AddressOB address) {
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

    public AddressOB getAddress() {
        return address;
    }

    public void setAddress(AddressOB address) {
        this.address = address;
    }
}
