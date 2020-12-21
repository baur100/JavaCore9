package lesson10Dec12;

public class Teacher extends PersonOB {
    protected String subject;

    public Teacher(String name, String lastName, int yearOfBirth, String subject) {
        super(name, lastName, yearOfBirth);
      this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSubject() {
        return subject;
    }
}
