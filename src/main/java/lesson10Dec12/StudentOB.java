package lesson10Dec12;

public final class  StudentOB extends PersonOB { // final is added when we don't want the class to be extended
    // (no child class could be created from class Student)

    //When we add "extends PersonOB,we make it child class of Person OB
    //extended means inherited from Parent class Person OB


   // private String name;           THESE 3 FIELDS MUST BE DELETED, BECAUSE THEY ARE
   // private String lastName;       INHERITED FROM PARENT CLASS BY DEFAULT.
   // private int yearOfBirth;       CONSTRUCTOR WILL WORK ANYWAYS


    private String schoolName;
    private String major;

    public StudentOB(String name, String lastName, int yearOfBirth, String schoolName, String major) {
       /*this.name = name;                        INSTEAD THESE 3 LINES WE
        this.lastName = lastName;                 CAN
        this.yearOfBirth = yearOfBirth;           USE */
        super(name, lastName, yearOfBirth);
        this.schoolName = schoolName;
        this.major = major;
    }

    public StudentOB() {
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {                WE ALSO DO NOT NEED GETTERS & SETTERS
        this.name = name;
    }                                                 FOR THESE 3 FIELDS

    public String getLastName() {                     THEY ARE INHERITED AS WELL!!!!!
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    } */

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
