package homework8;

public class AppDinner {
    public static void main(String[] args) {
        Dinner mondayDinner = new Dinner();
        mondayDinner.homeDinner = "Chicken Soup";
        mondayDinner.eatOut = " '99 restaurant' ";
        mondayDinner.takeout = "Pizza";

        Dinner tuesDinner = new Dinner();

        tuesDinner.homeDinner = "Stake";
        tuesDinner.takeout = "Sushi";
        tuesDinner.eatOut = "'5 Guys Burger'";

        mondayDinner.momiscooking();
        tuesDinner.worklate();


    }
}
