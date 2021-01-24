package floreslesson12;

public class App {
    public static void main(String[] args) {
        Address annaAddress = new Address("11 Elm ave","Trenton",State.FL,10101);
        String name = "Anna";
        String lastName = "Wilson";
        Person anna = new Person(name,lastName,annaAddress);

//        Person anna = new Person("Anna","Wilson",new Address("11 Elm ave","Trenton",State.FL,10101));
        System.out.println(anna);

        annaAddress.setCity("New York");
        String streetName = anna.getAddress().getStreetName();
        System.out.println(streetName);
        String cityName = anna.getAddress().getCity();
        System.out.println(cityName);

        State state = anna.getAddress().getState();
        System.out.println(state);
    }
}
