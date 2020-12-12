package lesson8SO03;

public class SO03Car {
    public String brand;
    public String model;
    public String color;
    public int year;

    public void startEngine(){
        System.out.println("Engine of "+brand+" "+model+" is started");
    }
    public void stopCar(){
        System.out.println(brand + " "+ model + " is stopped");
    }
}
