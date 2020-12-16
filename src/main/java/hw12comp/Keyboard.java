package hw12comp;

public class Keyboard {

    private String brand;
    private String color;

    public Keyboard(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "\nbrand='" + brand + '\'' +
                "\ncolor='" + color + '\'';
    }
}
