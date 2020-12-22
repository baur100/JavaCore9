package Homework12Lera;

public class Store {
    private String item;
    private String size;
    private String color;
    private int price;
    private String state;

    public Store(String state) {
        this.state = state;
    }

    public Store(String item, String size, String color, int price, State california) {
        this.item = item;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Store{" +
                "item='" + item + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
