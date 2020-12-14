package homework1011LT;

public class Doctor extends General {
    private int boardLicenseNumber;
    private String specialization;
    private String fellowship;

    public Doctor(String name, String lastName, int age, String gender, int boardLicenseNumber, String specialization, String fellowship) {
        super(name, lastName, age, gender);
        this.boardLicenseNumber = boardLicenseNumber;
        this.specialization = specialization;
        this.fellowship = fellowship;
    }

    public int getBoardLicenseNumber() {
        return boardLicenseNumber;
    }

    public void setBoardLicenseNumber(int boardLicenseNumber) {
        this.boardLicenseNumber = boardLicenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getFellowship() {
        return fellowship;
    }

    public void setFellowship(String fellowship) {
        this.fellowship = fellowship;
    }

    public Doctor() {
    }
    public void printInfo(){
        System.out.println("Name = "+name+
                "\nLast Name = "+lastName+
                "\nAge = "+age+
                "\nGender = "+gender+
                "\nSpecialization = "+specialization+
                "\nBoard License Number = "+boardLicenseNumber+
                "\nFellowship = "+fellowship);
    }

}
