package hm9;

public class Water {
    private String brand;
    private int size;
    private double price;
    private boolean available;

    public Water(String brand, int size, double price, boolean available) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    public Water(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Water() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void printWaterFullInfo() {
        System.out.println("Water " + getBrand() + " " + getSize() + " ml is available:" + getAvailable() + " for $" + getPrice());
    }

    public void printPriceWater() {
        System.out.println(getBrand() + " water is $" + getPrice());
    }
}
