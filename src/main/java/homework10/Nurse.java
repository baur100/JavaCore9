package homework10;

public class Nurse extends Person{
    private String position;
    private int workHours;

    public Nurse(String name, String lastName, int year, String position, int workHours) {
        super(name, lastName, year);
        this.position = position;
        this.workHours = workHours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
