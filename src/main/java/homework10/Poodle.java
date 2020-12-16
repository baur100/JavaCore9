package homework10;

public class Poodle extends Dog{

    private int yearOfBirth;

    public Poodle(String name, String color, int yearOfBirth) {
        super(name, color);
        this.yearOfBirth = yearOfBirth;
    }

    public Poodle(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public Poodle (){

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
