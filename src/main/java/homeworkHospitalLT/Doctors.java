package homeworkHospitalLT;

public class Doctors {
    private String name;
    private String lastName;
    Position type;

    public Doctors(String name, String lastName, Position type) {
        this.name = name;
        this.lastName = lastName;
        this.type = type;
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

    public Position getType() {
        return type;
    }

    public void setType(Position type) {
        this.type = type;
    }
    public Doctors(){}

    @Override
    public String toString() {
        return
                "Dr. " + name +" " + lastName + " MD" +

                ", " + type
                ;
    }
}
