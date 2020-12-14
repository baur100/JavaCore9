package homework9;

public class App {
    public static void main(String[] args) {

        Cat puma = new Cat();
        puma.setName("Puma");
        puma.setBreed("British");
        puma.setColor("Black");
        puma.setAge(24);

        puma.meow();

        Cat carrot = new Cat("Carrot", "Persian", "Ginger", 15);

        carrot.printCat();

        /////////////////////////////////////////////////////////////////////////////////////////

        Truck ram = new Truck();
        ram.setMake("Dodge RAM");
        ram.setModel(3500);
        ram.setColor("White");
        ram.setYear(2018);

        ram.inspection();

        Truck ford = new Truck("Ford", 250, "Red", 2015);

        ford.printTruck();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        Whiskey cheap = new Whiskey();
        cheap.setBrand("Jack Daniels");
        cheap.setName("Old 7");
        cheap.setKind("Bourbon");
        cheap.setAge(4);

        cheap.orderAdrink();

        Whiskey exp = new Whiskey("Jack Daniels","Single Barrel","Bourbon",7);

        exp.printWhiskey();


    }

}
