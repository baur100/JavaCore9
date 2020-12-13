package lesson11;

public class Student {
    private String name;
    private String lastName;
    private Subjects[] subjects;
    private Subjects major;

    public Student(String name, String lastName, Subjects[] subjects, Subjects major) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
        this.major = major;
    }
}
