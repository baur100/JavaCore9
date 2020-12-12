package lesson8SO03;

import java.sql.SQLOutput;

public class SO03App {
    public static void main(String[] args) {
        SO03Person mary = new SO03Person();
        mary.name = "Mary";
        mary.lastName = "Hudson";
        mary.age = 25;

        SO03Person jake = new SO03Person();
        jake.name = "Jake";
        jake.lastName = "Dobson";
        jake.age = 18;

        SO03Person steve = new SO03Person();
        steve.name = "Steve";
        steve.lastName = "Peters";
        steve.age = 40;

        printPerson(jake);
        printPerson(mary);

        SO03Vehicle myCar = new SO03Vehicle();
        myCar.brand = "Toyota";
        myCar.model = "Prius";
        myCar.color = "Pink";
        myCar.year = 1989;

        SO03Vehicle myFriendsCar = new SO03Vehicle();
        myFriendsCar.color = "Yellow";
        myFriendsCar.brand = "Honda";


    }

    public static void printPerson(SO03Person person){
        System.out.println("Name = "+person.name+"\nLast name = "+person.lastName+"\nage = "+person.age);
    }


}
