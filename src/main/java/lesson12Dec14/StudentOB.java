package lesson12Dec14;

public class StudentOB extends Person1 {
    private String major;

    public StudentOB(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getName(){
        return "Students name is " + super.name;
    }
    }

