package floreslesson8;

public class App {
    public static void main(String[] args) {
        Person mary = new Person();
        mary.name = "Mary";
        mary.lastName = "Hudson";
        mary.age = 25;
        mary.gender = "Female";

        Person jake = new Person();
        jake.name = "Jake";
        jake.lastName = "Dobson";
        jake.age = 18;
        jake.gender="Male";

        Person steve = new Person();
        steve.lastName="Peters";
        steve.age=26;
        steve.name="Steve";
        steve.gender="Male";

//        printPerson(jake);
//        printPerson(mary);
//        printPerson(steve);

        Vehicle myCar = new Vehicle();
        myCar.brand = "Lincoln";
        myCar.model = "MKZ";
        myCar.year = 2010;
        myCar.color = "Silver";

        Vehicle friendCar = new Vehicle();
        friendCar.brand = "Mazda";
        friendCar.model = "CX-5";
        friendCar.color = "White";
        friendCar.year = 2020;

        printCar(myCar);
        printCar(friendCar);

    }
    public static void printPerson(Person person){
        System.out.println("\nName: "+person.name+
                "\nLast name: "+person.lastName+
                "\nAge: "+person.age+
                "\nGender: "+ person.gender);
    }
    public static void printCar(Vehicle vehicle){
        System.out.println("Car: "+vehicle.brand+" "+vehicle.model+" "
                +vehicle.color+" "+vehicle.year);
    }
}
