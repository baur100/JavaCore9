package floreslesson10;

public class App {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Smith", 2001, "MIT", "Ancient Art");
        System.out.println(anna.getLastName());

        Teacher mrJones = new Teacher("Alan", "Jones",1990, "Math");

        TempTeacher msDole = new TempTeacher("Lisa","Dole", 1998,"History","January");

        String str = new String("Hello world");

        Person xx = new TempTeacher("Dana", "Seymur",1999,"Poetry","June");


    }
}
