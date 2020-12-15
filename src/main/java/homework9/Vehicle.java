package homework9;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle() {
    }
    public void printMe(){
        System.out.println("Brand="+ this.brand + "\nModel="+ this.model + "\nYear="+ this.year);
    }
}
