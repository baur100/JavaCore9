package hm9;

public class Burger {
    private String name;
    private String size;
    private double price;

    public Burger(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Burger() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }

    public void printBurger() {
        System.out.println(getSize() + getName() + " burger is $" + getPrice());
    }
}
