package homework10OB;

public class ChildrenOB extends GrandParentOB {
    private String education;
    private String hobby;
    private String profession;


    public ChildrenOB(String name, String lastName, int yearOfBirth, String hairColor,
                      String eyeColor, String education, String hobby, String profession) {
        super(name, lastName, yearOfBirth, hairColor, eyeColor);
        this.education = education;
        this.hobby = hobby;
        this.profession = profession;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void printChild(){
        System.out.println("Name:"+this.name+
                "\n Last Name:"+this.lastName+" "+
                "\n Year of birth:"+this.yearOfBirth+" "+
                "\n Eye Color:"+this.eyeColor+" "+
                "\n Hair Color:"+this.hairColor+" "+
                "\n Education:"+this.education+" "+
                "\n Profession:"+this.profession+" "+
                "\n Hobby:"+this.hobby);
    }
}
