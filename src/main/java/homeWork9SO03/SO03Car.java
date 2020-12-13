package homeWork9SO03;

public class SO03Car {
    private String brand;
    private String model;
    private String color;
    private int year;

    public SO03Car(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public SO03Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public SO03Car(){}

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
