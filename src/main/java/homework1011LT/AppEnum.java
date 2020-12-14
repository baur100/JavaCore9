package homework1011LT;

public class AppEnum {
    public static void main(String[] args) {
        Sandwich regular = new Sandwich("regular", Meats.PASTRAMI, Cheese.CHEDDAR);
        regular.mySandwich();

        Meats[] myOrderMeats = {Meats.BACON, Meats.HAM, Meats.PASTRAMI, Meats.SALAMI};
        Cheese[] myOrderCheese = {Cheese.CHEDDAR, Cheese.FETA};

        Pizza personal = new Pizza("Personal Favorite", "large", myOrderMeats, myOrderCheese );
        System.out.println(personal);

    }



}
