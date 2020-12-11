package hw8;

public class Myhw8 {
    public static void main(String[] args) {

        Client jake = new Client();
        jake.firstName = "Jake";
        jake.lastName = "Conrad";
        jake.gender = "male";
        jake.age = 35;
        jake.weight = 220;
        jake.height = 5.11;

        Client lana = new Client();
        lana.firstName = "Lana";
        lana.lastName = "Gold";
        lana.gender = "female";
        lana.age = 54;
        lana.weight = 250;
        lana.height = 5.0;


        printClient(jake);
        printClient(lana);

    }

    public static void printClient(Client client){
        System.out.println("First name = " + client.firstName +
                "\nLast name = " + client.lastName +
                "\nGender = " + client.gender +
                "\nage = " + client.age +
                "\nweight = " + client.weight + " lbs" +
                "\nheight = " + client.height + " ft");
    }

}
