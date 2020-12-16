package homeWork12SO03;

public class SO03HW12Monitor {
    private String brand;
    private String model;
    private double diagonal;

    public SO03HW12Monitor(String brand, String model, double diagonal) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
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

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }


    public String toString() {
        return brand + " "+ model + " " + diagonal;
    }
}
