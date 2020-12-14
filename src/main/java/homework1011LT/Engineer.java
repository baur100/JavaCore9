package homework1011LT;

public class Engineer extends General {
    private int engineerLicenseNumber;
    private String engineeringDiscipline;
    private int yearInPractice;



    public Engineer(String name, String lastName, int age, String gender, int engineerLicenseNumber, String engineeringDiscipline, int yearInPractice) {
        super(name, lastName, age, gender);
        this.engineeringDiscipline = engineeringDiscipline;
        this.engineerLicenseNumber = engineerLicenseNumber;
        this.yearInPractice = yearInPractice;
    }

    public void setEngineerLicenseNumber(int engineerLicenseNumber){
        this.engineerLicenseNumber = engineerLicenseNumber;
    }
    public int getEngineerLicenseNumber(){
        return engineerLicenseNumber;
    }

    public void setEngineeringDiscipline(String engineeringDiscipline){
        this.engineeringDiscipline = engineeringDiscipline;
    }
    public String getEngineeringDiscipline(){
        return engineeringDiscipline;
    }
    public void setYearInPractice(int yearInPractice){
        this.yearInPractice = yearInPractice;
    }
    public int getYearInPractice(){
        return yearInPractice;
    }
    public Engineer(){}

    public void printInfo(){
        System.out.println("Name = "+name+
                "\nLast Name = "+lastName+
                "\nAge = "+age+
                "\nGender = "+gender+
                "\nEngineering Discipline = "+engineeringDiscipline+
                "\nEngineer License Number = "+engineerLicenseNumber+
                "\nYears in Practice = "+yearInPractice);
    }
}




