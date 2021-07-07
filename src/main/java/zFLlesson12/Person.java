package zFLlesson12;

public class Person {
    protected String name;
    protected String lastName;
    protected Address address;

    public Person(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getAnme() {
        return name;
    }

    public void setAnme(String anme) {
        this.name = anme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
