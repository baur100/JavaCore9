package homework8IP;

public class App {
    public static void main(String[] args) {
        Animals myCat = new Animals();
        myCat.name = "Winny";
        myCat.breed = "BH";
        myCat.color = "Grey";
        myCat.age = 1;


        myCat.printAnimal();

        Animals friendCat = new Animals();
        friendCat.name = "Pushkin";
        friendCat.breed = "AC";
        friendCat.color = "Red Head";

        friendCat.printAnimal();
    }
}
