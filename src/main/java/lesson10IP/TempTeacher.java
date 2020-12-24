package lesson10IP;

public class TempTeacher extends TeacherIP {
   private String month;

    public TempTeacher(String name, String familyName, int yearOfBirth, String subject, String month) {
        super(name, familyName, yearOfBirth, subject);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
