package homework9;

public class Truck {
    private String make;
    private int model;
    private String color;
    private int year;

    public Truck(String make, int model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Truck() {
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void inspection(){
        System.out.println("Your "+ make + " "+ model + " passed the inspection");
    }
    public void printTruck(){
        System.out.println("Make = " + make +
                "\nModel = " + model +
                "\nColor = " +color +
                "\nYear = " + year);
    }

}

