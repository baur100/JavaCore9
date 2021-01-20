package floreslesson10;

public class Teacher extends Person{
    protected String subject;

    public Teacher(String name, String lastName, int yearOfBirth, String subject) {
        super(name,lastName,yearOfBirth);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
