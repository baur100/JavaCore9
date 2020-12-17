package homework8IP;

public class Person {
    public static String name;
    public static String lastName;
    public static int age;

    public static void printPerson() {
        Person baby = new Person();
        System.out.println("Name = " + baby.name +
                "\nLast name = " + baby.lastName +
                "\nAge = " + baby.age);

    }
}
