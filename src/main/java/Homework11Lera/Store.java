package Homework11Lera;

public class Store {
    private String item;
    private String color;

    public Store(String item, String color) {
        this.item = item;
        this.color = color;

    }

    public Store(String shoes, Shoes boots) {

    }

    public Store(String bag, Bag tote) {

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
