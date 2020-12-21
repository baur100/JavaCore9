package homeworkHashMapLT;

public class CarModels {
    private String model;
    private String brand;
    private String type;

    public CarModels(String model, String brand, String type) {
        this.model = model;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Model: " + model +
                ", Brand: " + brand +
                ", Type: " + type
                ;
    }
}
