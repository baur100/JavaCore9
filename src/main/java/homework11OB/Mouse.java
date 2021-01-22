package homework11OB;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "Brand: "+brand+"     " +"Model: "+model;
    }
}
