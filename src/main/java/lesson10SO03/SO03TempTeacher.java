package lesson10SO03;

public class SO03TempTeacher extends SO03Teacher{
    private String month;

    public SO03TempTeacher(String name, String lastName, int yearOfBirth, String subject, String month) {
        super(name, lastName, yearOfBirth, subject);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
