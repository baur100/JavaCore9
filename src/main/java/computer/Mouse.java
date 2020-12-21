package computer;

public class Mouse {
    private String brand;
    private String model;

    public Mouse(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
