package hm9;

public class App {
    public static void main(String[] args) {
        Dog lola = new Dog("Lola", "pomeranian", 1);
        lola.printDog();

        Dog chanel = new Dog();
        chanel.setName("Chanel");
        chanel.setBreed("unknown");
        chanel.setAge(10);
        chanel.printDog();

        Apartment family = new Apartment("Family", 3, 1200);
        family.printApartment();

        Apartment single = new Apartment();
        single.setTypeOfApartment("Single");
        single.setBedrooms(1);
        single.setCostRent(700);
        single.printApartment();

        Water dasani = new Water("Dasani", 500, 2, true);
        dasani.printWaterFullInfo();

        Water evian = new Water();
        evian.setBrand("Evian");
        evian.setPrice(2.56);
        evian.setAvailable(true);
        evian.setSize(1000);
        evian.printWaterFullInfo();

        Water fiji = new Water("FIJI", 3);
        fiji.printPriceWater();

        Burger bigMac = new Burger("Big Mac", "", 4.56);
        bigMac.printBurger();

        Burger doubleQuarterPounder = new Burger();
        doubleQuarterPounder.setName("Quarter Pounder");
        doubleQuarterPounder.setSize("Double ");
        doubleQuarterPounder.setPrice(5.46);
        doubleQuarterPounder.printBurger();


    }
}
