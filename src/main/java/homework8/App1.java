package homework8;

public class App1 {
    public static void main(String[] args) {
        Person john = new Person();
        john.name = "John";
        john.lastName = "Smith";
        john.age = 30;

        Person liza = new Person();
        liza.name = "Liza";
        liza.lastName = "Blake";
        liza.age = 20;

        printPerson(john);
        printPerson(liza);
    }


    public static void printPerson(Person person){
        System.out.println("Name = "+person.name+
                "\nLast name = "+person.lastName+
                "\nAge = "+person.age);
    }
}
