package zhm9;

public class Restaurant {
    private String restaurant;
    private String food;
    private double price;

    public Restaurant() {
    }

    public Restaurant(String restaurant, String food, double price) {
        this.restaurant = restaurant;
        this.food = food;
        this.price = price;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    private String printInfo(){
        return ("I had at " + restaurant + " " + food + ". It was " + price + " $");
    }

    public void printClass() {
        System.out.println(printInfo());
    }
}
