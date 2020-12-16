package lesson10SO03;

public final class SO03Student extends SO03Person{

    private String schoolName;
    private String major;

    public SO03Student(String name, String lastName, int yearOfBirth, String schoolName, String major) {
        super(name,lastName,yearOfBirth);
        this.schoolName = schoolName;
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
