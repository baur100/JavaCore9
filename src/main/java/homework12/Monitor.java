package homework12;

public class Monitor {
    private String brand;
    private String model;
    private int inches;

    public Monitor(String brand, String model, int inches) {
        this.brand = brand;
        this.model = model;
        this.inches = inches;
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

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
}
