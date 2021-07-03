package zFLlesson8;

public class Vehicle {
    public String brand;
    public String model;
    public String color;
    public int year;

    public void printCarInfo(){
        System.out.println("Car "+brand+" "+model+" was made in "+year+" and has a "+color+" color");
    }

    public void stopCar(){
        System.out.println("Car "+brand+" is stopped");
    }
}
