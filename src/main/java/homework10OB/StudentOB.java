package homework10OB;

public class StudentOB {
    private String name;
    private String lastName;
    private SubjectOB[] subjects;
    private NameOfSchool nameOfSchool;
    private SubjectOB major;

    public StudentOB(String name, String lastName, SubjectOB[] subjects, NameOfSchool nameOfSchool, SubjectOB major) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
        this.nameOfSchool = nameOfSchool;
        this.major = major;
    }

    public void printStudent(){
        System.out.println(" Name: "+this.name+" "+
                "\n Last Name: "+ this.lastName+" "+
                "\n Name of School: "+this.nameOfSchool+" "+
                        "\n Major: "+this.major+" "+
                "\n Subjects: "+this.subjects);
    }
}
