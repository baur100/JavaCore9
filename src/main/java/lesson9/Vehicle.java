package lesson9;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public void setYear(int year){
        this.year=year;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getYear(){
        return this.year;
    }
    public String getBrand(){
        return this.brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
