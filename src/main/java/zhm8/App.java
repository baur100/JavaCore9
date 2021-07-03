package zhm8;

import floreslesson11.Subjects;

public class App {
    public static void main(String[] args) {
        Restaurant starbucks = new Restaurant();
        starbucks.restaurant = "Starbucks";
        starbucks.food="Coffee, Breakfast sandwich and Almond croissant";
        starbucks.price=16.30;
        starbucks.receipt();

        Vacation independence_day= new Vacation();
        independence_day.when="Tomorrow";
        independence_day.days=1;
        independence_day.transport="Car";
        independence_day.hours=3;
        independence_day.vacation_plans();

        Supermarket publix = new Supermarket();
        publix.supermarket="Publix";
        publix.item="milk";
        publix.price=1.20;
        publix.print_supermarketList();

        Dog myDog = new Dog();
        myDog.name="Lola";
        myDog.breed="Pomeranian";
        myDog.age=7;
        myDog.printDogInfo();

    }
}
