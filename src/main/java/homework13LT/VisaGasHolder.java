package homework13LT;



public class VisaGasHolder implements Discounts{
    private String name;
    private double otherPurchaseCost;
    private double gasCost;
    private double restaurantCost;
    private double otherPurchaseDiscount;
    private double gasDiscount;
    private double restaurantDiscount;

    public VisaGasHolder(String name, double otherPurchaseCost, double gasCost, double restaurantCost, double otherPurchaseDiscount, double gasDiscount, double restaurantDiscount) {
        this.name = name;
        this.otherPurchaseCost = otherPurchaseCost;
        this.gasCost = gasCost;
        this.restaurantCost = restaurantCost;
        this.otherPurchaseDiscount = otherPurchaseDiscount;
        this.gasDiscount = gasDiscount;
        this.restaurantDiscount = restaurantDiscount;


    }


    @Override
    public void info() {
        System.out.println("Visa Gas Cardholder = "+name+
                "\nDiscount Breakdown: Other Purchases - "+(this.otherPurchaseDiscount*100)+"%, Gas Discount - "+(this.gasDiscount*100)+"%, Restaurant Discount - "+(this.restaurantDiscount*100)+"%");
    }

    @Override
    public double getOtherPurchaseDiscountedPrice() {
        return (otherPurchaseCost-(otherPurchaseCost*otherPurchaseDiscount));
    }

    @Override
    public double getGasDiscountedPrice() {
        return (gasCost-(gasCost*gasDiscount));
    }

    @Override
    public double getRestaurantDiscountedPrice() {
        return (restaurantCost-(restaurantCost*restaurantDiscount));
    }

    @Override
    public double getTotalPurchase() {
        return (otherPurchaseCost+gasCost+restaurantCost);
    }

    @Override
    public double getTotalDiscount() {
        return (getGasDiscountedPrice()+getRestaurantDiscountedPrice()+getOtherPurchaseDiscountedPrice());
    }

    @Override
    public double getNetPurchase() {
        return (getTotalPurchase()-getTotalDiscount());
    }
}
