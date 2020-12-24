package lesson10IP;

public class PersonIP {
    protected String name;
    protected String familyName;
    protected int yearOfBirth;

    public PersonIP(String name, String familyName, int yearOfBirth) {
        this.name = name;
        this.familyName = familyName;
        this.yearOfBirth = yearOfBirth;
    }

    public PersonIP() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    }
