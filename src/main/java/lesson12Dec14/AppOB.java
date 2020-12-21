package lesson12Dec14;

public class AppOB {
    public static void main(String[] args) {
/*AddressOB annaAddress = new AddressOB("11 Elm Ave","Trenton",StatesOB.FL,10101);

      PersonOB anna = new PersonOB("Anna","Lee", annaAddress);

     SAME THING:

      PersonOB anna = new PersonOB("Anna","Lee",new AddressOB("11 Elm Ave","Trenton"
         ,StatesOB.FL,10101));

      SAME THING AS: */

        AddressOB annaAddress = new AddressOB("11 Elm Ave","Trenton",StatesOB.FL,10101);
        String name = "Anna";
        String lastName = "Lee";
        PersonOB anna = new PersonOB(name,lastName, annaAddress);


annaAddress.setCity("New York");
        String streetName = anna.getAddress().getStreetName();
        System.out.println(streetName);
        String city = anna.getAddress().getCity();
        System.out.println(city);

        StatesOB state = anna.getAddress().getState();
        System.out.println(state);


    }
}