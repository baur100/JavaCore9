package lesson10;

public class Person {
    protected String name;
    protected String familyName;
    protected int yearOfBirth;  // year_of_birth - snake case

    public Person(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.familyName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return familyName;
    }

    public void setLastName(String lastName) {
        this.familyName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
