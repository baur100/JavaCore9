package homeworkArrayListLT;

public class Professionals  {
    private String name;
    private int age;
    Jobs additional;

    public Professionals(String name, int age, Jobs additional) {
        this.name = name;
        this.age = age;
        this.additional = additional;
    }

    @Override
    public String toString() {
        return '{' +
                "Name= " + name +
                ", Age= " + age +
                ", Profession= " + additional +
                '}';
    }
}
