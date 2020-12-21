package lesson10Dec12;

public class TempTeacherOB extends Teacher{
    private String month;

    public TempTeacherOB(String name, String lastName, int yearOfBirth, String subject, String month) {
        super(name, lastName, yearOfBirth, subject);
        this.month = month;

    }
}
