package homework9IP;

public class AppIP {
    public static void main(String[] args) {

        City newYork = new City("New York", "New York", "10306");
        newYork.printCityInfo();
        newYork.setZipCode("10307");
        newYork.printCityInfo();

        City sf =new City();
        sf.setName("SomeName");
        sf.printCityInfo();
        System.out.println(newYork.getName());

    }
}
