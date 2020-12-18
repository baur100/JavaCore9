package homework13LT;

public class App {
    public static void main(String[] args) {
        VisaGasHolder adam = new VisaGasHolder("Adam Smith", 89.61, 55.73, 121.57, 0.10, 0.20, 0.15);
        AmexRestaurantGold jane = new AmexRestaurantGold("Jane Robertson", 251.75, 85.12, 350.60, 0.05, 0.10, 0.25);

        Discounts xx = new VisaGasHolder("New Customer", 0.0, 0.0, 0.0, 0.1, 0.2, 0.15);
        Discounts zz = new AmexRestaurantGold("New Customer", 0.0,0.0,0.0,0.05, 0.10, 0.25);


        Discounts[] customers = {adam, jane, xx, zz};

        for (Discounts v : customers){
            v.info();
            System.out.println (v.getTotalPurchase());
            System.out.println(v.getTotalDiscount());
            System.out.println(v.getNetPurchase());
        }








    }

}
