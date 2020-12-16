package lesson12SO03;

public class SO03L12App {
    public static void main(String[] args) {
        SO03L12Address annaAddress = new SO03L12Address("11 Elm Ave","Trenton",SO03L12State.FL,10101);
        String name = "Anna";
        String lastName = "Wilson";
        SO03L12Person anna = new SO03L12Person(name,lastName,annaAddress);

//        SO03L12Person anna = new SO03L12Person("Anna","wilson",new SO03L12Address("11 Elm Ave","Trenton",SO03L12State.FL,10101));

        annaAddress.setCity("New York");
        String streetName = anna.getAddress().getStreetName();
        System.out.println(streetName);
        String city = anna.getAddress().getCity();
        System.out.println(city);

        SO03L12State state = anna.getAddress().getState();
        System.out.println(state);




    }
}
