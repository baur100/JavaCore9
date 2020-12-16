package lesson12SO03;

public class SO03L12Student extends SO03L12Person1{
    private String major;

    public SO03L12Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getName(){
        return "Students name is " + super.name;
    }
}
