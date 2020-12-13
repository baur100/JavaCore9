package lesson8Dec7;

public class AppOB77 {
    public static void main(String[] args) {
      PersonOB77 mary = new PersonOB77();
      mary.name = "Mary";
      mary.lastName = "Hudson";
      mary.age = 25;

      PersonOB77 jake = new PersonOB77();
      jake.name = "Jake";
      jake.lastName = "Dobson";
      jake.age = 18;
      printPerson(jake);

      VehicleOB77 myCar = new VehicleOB77();
      myCar.brand = "Toyota";
      myCar.model = "Prius";
      myCar.color = "Pink";
      myCar.year = 1989;


      VehicleOB77 myFriendsCar = new VehicleOB77();
        myFriendsCar.color="Yellow";
      myFriendsCar.brand="Honda";


    }
    public static void printPerson (PersonOB77 person){
        System.out.println("Name = "+person.name +
                "\nLast Name = " + person.lastName +
                "\nAge=" + person.age);
    }

}
