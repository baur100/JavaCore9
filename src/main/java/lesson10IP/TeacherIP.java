package lesson10IP;

public class TeacherIP extends PersonIP {
    protected String subject;

    public TeacherIP(String name, String familyName, int yearOfBirth, String subject) {
        super(name, familyName,yearOfBirth);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
