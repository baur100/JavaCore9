package homework9IP;

public class AppIP {
    public static void main(String[] args) {
        City newyork = new City();
        newyork.name = "New York";
        newyork.state = "NY";
        newyork.zipCode = "11001";

        City sf = new City();
        sf.name = "San Francisco";
        sf.state = "CA";
        sf.zipCode = "22002";

        printCity(sf);

    }

    public static void printCity(City city){
        System.out.println("Name = "+city.name+
                "\nState = "+city.state+
                "\nZipCode ="+city.zipCode);

    }

}
