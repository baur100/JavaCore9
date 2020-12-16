package homeWork12SO03;

public class SO03HW12Processor {
    private String brand;
    private String model;
    private int core;

    public SO03HW12Processor(String brand, String model, int core) {
        this.brand = brand;
        this.model = model;
        this.core = core;
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

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }


    public String toString() {
        return brand + " " + model + " " + core;
    }
}
