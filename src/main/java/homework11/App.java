package homework11;

public class App {
    public static void main(String[] args) {
        Colors sky = Colors.BLUE;


        Clothing[] jennyClothes = {Clothing.DRESS,Clothing.BLOUSE,Clothing.BLOUSE};

        Woman jenny = new Woman(jennyClothes, "Jenny Smith", "Miami");
        System.out.println(jenny.getClothing());
    }
}
