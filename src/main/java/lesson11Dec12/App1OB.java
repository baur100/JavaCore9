package lesson11Dec12;

public class App1OB {
    public static void main(String[] args) {
        Address myAddress = new Address("Elm Str", "Gotham City",StatesOB.FL,99999);
        System.out.println(myAddress);
        //WILL NOT WORK AS sout PRINTS ONLY STRINGS AND PRIMITIVES,
        // but by adding toString (look in the Address class)we can do it.
    }
}
 // 1:25 -homework explanation