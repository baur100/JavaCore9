package homework10IP;

import lesson10.Person;
import lesson10.Student;
import lesson10.Teacher;
import lesson10.TempTeacher;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog("sharik", 2, "brown", "Mastif");
        System.out.println("Name of my dog is " + myDog.getName());
        myDog.makeSound();

        Cat myCat = new Cat("musya", 1, "white", "maincun");
        System.out.println("Name of my cat is " + myCat.getName());
        myCat.makeSound();

        Parrot myParrot = new Parrot("Kesha", 57, "rainbow", "feather");
        System.out.println("Name of my parrot is " + myParrot.getName());
        myParrot.makeSound();
    }
}
