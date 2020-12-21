package lesson10Dec12;

import org.w3c.dom.ls.LSOutput;

public class AppOB {
    public static void main(String[] args) {

        StudentOB anna = new StudentOB("Anna", "Smith", 2001, "MIT", "Ancient Art");
        System.out.println(anna.getLastName());

        Teacher mrJones = new Teacher("Noah","Jones", 1987,"Math");

        TempTeacherOB msDoll = new TempTeacherOB("Margaret","Doll",
                1990, "Biology","June");

        Teacher xx = new TempTeacherOB("Dana","Seumour",1999,"Poetry","June");
        // we can create a variable of a parent class and assign values of the child class
    }
}




