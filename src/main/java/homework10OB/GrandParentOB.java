package homework10OB;

public class GrandParentOB {
    protected String name;
    protected String lastName;
    protected int yearOfBirth;
    protected String hairColor;
    protected String eyeColor;

    public GrandParentOB(String name, String lastName, int yearOfBirth, String hairColor, String eyeColor) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public GrandParentOB() {
    }

    public GrandParentOB(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    public void printGrandParent(){
        System.out.println("Name:" + this.name+
                "\n Last Name:"+this.lastName+" "+
                "\n Year of birth:"+this.yearOfBirth+" "+
                "\n Eye Color:"+this.eyeColor+" "+
                "\n Hair Color:"+this.hairColor);
    }
    }

