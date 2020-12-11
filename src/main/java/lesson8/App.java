package lesson8;

public class  App {
    public static void main(String[] args) {
        Person mary = new Person();
        mary.name = "Mary";
        mary.lastName = "Hudson";
        mary.age = 25;

        Person jake = new Person();
        jake.name = "Jake";
        jake.lastName = "Dobson";
        jake.age = 18;

        Person steve = new Person();
        steve.age = 26;
        steve.lastName = "Peters";
        steve.name = "Steve";
        steve.gender = "Male";

        printPerson(jake);
        printPerson(mary);
        printPerson(steve);

        Vehicle myCar = new Vehicle();
        myCar.brand = "Toyota";
        myCar.model = "Prius";
        myCar.color = "Pink";
        myCar.year = 1989;

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.color = "Yellow";
        myFriendsCar.brand = "Honda";



    }

    public static void printPerson(Person person){
        System.out.println("Name = "+person.name+
                "\nLast name = "+person.lastName+
                "\nAge = "+person.age);
    }
}
