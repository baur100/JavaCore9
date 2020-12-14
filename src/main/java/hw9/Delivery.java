package hw9;

public class Delivery extends TeamMember{
    private String gender;
    private int truckNumber;

    public Delivery(String name, String lastName, int birthYear, String gender, int truckNumber) {
        super(name, lastName, birthYear);
        this.gender = gender;
        this.truckNumber = truckNumber;
    }

    public String getGender() {
        return gender;
    }

    public int getTruckNumber() {
        return truckNumber;
    }
}
