package lesson11SO03;

public class SO03Student {
    private SO03Subjects[] subjects;
    private String name;
    private SO03Subjects major;

    public SO03Student(SO03Subjects[] subjects, String name, SO03Subjects major) {
        this.subjects = subjects;
        this.name = name;
        this.major = major;
    }
}
