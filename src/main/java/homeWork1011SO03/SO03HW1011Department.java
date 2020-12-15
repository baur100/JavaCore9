package homeWork1011SO03;

public class SO03HW1011Department extends SO03HW1011Staff{
    private String jobTitle;
    private int dayOfHire;
    private int monthOfHire;
    private int yearOfHire;

    public SO03HW1011Department(String name, String lastName, String department, String jobTitle, int dayOfHire, int monthOfHire, int yearOfHire) {
        super (name, lastName, department);
        this.jobTitle = jobTitle;
        this.dayOfHire = dayOfHire;
        this.monthOfHire = monthOfHire;
        this.yearOfHire = yearOfHire;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getDayOfHire() {
        return dayOfHire;
    }

    public void setDayOfHire(int dayOfHire) {
        this.dayOfHire = dayOfHire;
    }

    public int getMonthOfHire() {
        return monthOfHire;
    }

    public void setMonthOfHire(int monthOfHire) {
        this.monthOfHire = monthOfHire;
    }

    public int getYearOfHire() {
        return yearOfHire;
    }

    public void setYearOfHire(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }
}
