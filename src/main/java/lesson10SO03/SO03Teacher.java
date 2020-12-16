package lesson10SO03;

public class SO03Teacher extends SO03Person{

    protected String subject;

    public SO03Teacher(String name, String lastName, int yearOfBirth, String subject) {
        super(name,lastName,yearOfBirth);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
