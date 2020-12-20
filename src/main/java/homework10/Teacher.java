package homework10;

public class Teacher extends Person{
    private String subject;
    private String school;

    public Teacher(String name, String lastName, int year, String subject, String school) {
        super(name, lastName, year);
        this.subject = subject;
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
