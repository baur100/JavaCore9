package lesson8;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;

    public void startEngine(){
        System.out.println("Engine of "+brand+" "+ model+" is started");
    }
    public void stopCar(){
        System.out.println(brand + " "+ model +" is stopped");
    }
}
