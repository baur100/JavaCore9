package homework10OB;

public class GrandChildrenOB extends GrandParentOB {
    private String sport;
    private String education;
    private String hobby;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public GrandChildrenOB(String name, String lastName, int yearOfBirth, String hairColor, String eyeColor,
                           String sport, String education, String hobby) {
        super(name, lastName, yearOfBirth, hairColor, eyeColor);
        this.sport = sport;

    }

    public void printGrandChild() {
        System.out.println("Name:" + this.name + " " +
                "\n Last Name:" + this.lastName + " " +
                "\n Year of birth:" + yearOfBirth + " " +
                "\n Eye Color:" + this.eyeColor + " " +
                "\n Hair Color:" + this.hairColor + " " +
                "\n Education:" + this.education + " " +
                "\n Hobby:" + this.hobby + " " +
                "\n Sport:" + this.sport);

    }

    public GrandChildrenOB(String name, String lastName, int yearOfBirth, String hairColor, String eyeColor,
                           String sport, String hobby) {
        super(name, lastName, yearOfBirth, hairColor, eyeColor);
        this.sport = sport;
        this.hobby = hobby;
    }
    public void printYoungerGC(){
        System.out.println("Name:" + this.name + " " +
                "\n Last Name:" + this.lastName + " " +
                "\n Year of birth:" + yearOfBirth + " " +
                "\n Eye Color:" + this.eyeColor + " " +
                "\n Hair Color:" + this.hairColor + " " +
                "\n Hobby:" + this.hobby + " " +
                "\n Sport:" + this.sport);
    }
}
