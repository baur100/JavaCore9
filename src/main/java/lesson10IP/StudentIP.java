package lesson10IP;

public final class StudentIP extends PersonIP{
    private String schoolName;
    private String major;

    public StudentIP(String name, String familyName, int yearOfBirth, String schoolNAme, String major) {
        super(name,familyName,yearOfBirth);
        this.schoolName = schoolNAme;
        this.major = major;
    }

    public String getSchoolNAme() {
        return schoolName;
    }

    public void setSchoolNAme(String schoolNAme) {
        this.schoolName = schoolNAme;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
