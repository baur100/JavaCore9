package lesson10;

public class App {
    public static void main(String[] args) {
        final int XX = 5;
//        XX = 99;
        // Classes starts with capital letters = FileName
        // variable stars with lowercase letters
        // functions starts with lowercase
        // final variables (constants), enum members - capital only
        // Java use camelCase not a snake_case

        Student anna = new Student("Anna","Smith",2001,"MIT","Acient Art");
        System.out.println(anna.getLastName());

        Teacher mrJones = new Teacher("Alan","Jones",1990,"Math");

        TempTeacher msDole = new TempTeacher("Lisa","Dole",1998,"History","January");

        String str = new String("Hello world");

        // int, double, boolean, char, short, long, byte - primitive types

        Person xx = new TempTeacher("Dana","Seymur",1999,"Poetry","June");

    }
}
