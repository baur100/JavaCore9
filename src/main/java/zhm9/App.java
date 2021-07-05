package zhm9;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog("Lola", "pomeranian",7);
        myDog.printClass();

        Dog lerasDog = new Dog();
        lerasDog.setName("Chocolate");
        lerasDog.setBreed("maltipoo");
        lerasDog.setAge(24);
        lerasDog.printClass();

        System.out.println("Class 2:");
        Restaurant fiveJuly = new Restaurant("Starbucks", "Caramel latte and Almond croissant",8.50);
        fiveJuly.printClass();

        Restaurant fourJuly = new Restaurant();
        fourJuly.setRestaurant("Wendy's");
        fourJuly.setFood("Double Stack burger ans Pineapple Mango Lemonade");
        fourJuly.setPrice(6);
        fourJuly.printClass();

        System.out.println("Class 3:");
        Supermarket kroger=new Supermarket("Kroger", "Cheese", 7.89);
        kroger.printClass();

        Supermarket target = new Supermarket();
        target.setSupermarket("Target");
        target.setItem("Wipes");
        target.setPrice(14.99);
        target.printClass();

        System.out.println("Class 4:");
        Vacation independenceDay =new Vacation("Yesterday", 1,"car", 3 );
        independenceDay.printClass();

        Vacation california = new Vacation();
        california.setWhen("One day");
        california.setDays(2);
        california.setTransport("Plane");
        california.setHours(7.23);
        california.printClass();
    }
}
