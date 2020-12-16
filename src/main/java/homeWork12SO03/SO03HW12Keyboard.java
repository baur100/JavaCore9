package homeWork12SO03;

public class SO03HW12Keyboard {
    private String brand;
    private String model;

    public SO03HW12Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String toString() {
        return "SO03HW12Keyboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
