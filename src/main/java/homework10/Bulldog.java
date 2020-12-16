package homework10;

public class Bulldog extends Dog{
    private String name;
    private String color;
    private int yearOfBirth;
    private String size;


    public Bulldog(String name, String color, int yearOfBirth, String size) {
        this.name = name;
        this.color = color;
        this.yearOfBirth = yearOfBirth;
        this.size = size;
    }

    public int getYearOfBirth() {

    return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSize() {

    return size;
    }

    public void setSize(String size) {

    this.size = size;
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
